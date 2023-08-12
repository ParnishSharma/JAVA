package LinkedList;

public class palindromeLL {
    Node head;
    private int size = 0;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;

        }

    }

    public void add(String data) {
        Node addon = new Node(data);
        if (head == null) {
            head = addon;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = addon;
        }

    }

    public void getlist() {

        Node start = head;
        while (start != null) {
            System.out.print(start.data + "->");
            start = start.next;
        }
        System.out.println("null");
    }

    public void delnode(int num) {
        System.out.println("the size is: " + size);
        if (head == null) {
            return;
        }

        int vars = 2;
        Node delcurnode = head.next;
        Node delprevNode = head;
        System.out.println("This is my delcur size: " + size);
        int delval = size - num + 1; // MOST IMPORTATNT LOGIC
        while (vars != delval) {
            delcurnode = delcurnode.next;
            delprevNode = delprevNode.next;
            vars++;
        }
        delprevNode.next = delcurnode.next;
    }

    public Node findmiddle(Node head) {
        Node hare = head;
        Node turtle = head;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;

    }

    public Node Reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;

    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node firstHalfEnd = findmiddle(head);
        Node secondHalfStart = Reverse(firstHalfEnd.next);
        Node firstHalfStart = head;

        while (secondHalfStart != null) {
            if (secondHalfStart.data != firstHalfStart.data) {
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }

        return true;
    }

    public void getsize() {
        System.out.println(size);
        return;
    }

    public static void main(String[] args) {
        palindromeLL list = new palindromeLL();

        list.add("1"); // 1
        list.add("2");// 2
        list.add("3");// 3
        list.add("2");// 6
        list.add("1");// 7
        list.getlist();
        if (list.isPalindrome(list.head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }

}
