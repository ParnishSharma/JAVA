package LinkedList;

public class practll {
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

    public void getsize() {
        System.out.println(size);
        return;
    }

    public static void main(String[] args) {
        practll list = new practll();

        list.add("hey"); // 1
        list.add("hello");// 2
        list.add("Parnish");// 3
        list.add("11");// 4
        list.add("22");// 5
        list.add("33");// 6
        list.add("44");// 7

        list.getlist();
        list.delnode(6);

        list.getlist();
    }
}