package STACK;

//USING LINKED LIST

public class Stack {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stacks {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void Push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;

        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;

        }

    }

    public static void main(String[] args) {
        Stacks s = new Stacks();
        Stacks.Push(4);
        Stacks.Push(5);
        Stacks.Push(6);
        Stacks.Push(7);
        Stacks.Push(1);
        while (!Stacks.isEmpty()) {
            System.out.println(Stacks.peek() + ", ");
            Stacks.pop();
            System.out.print(Stacks.peek());

        }
    }

}
