package LinkedList;

public class pract {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addfirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    public void addlast(String data) {
        Node newlastnode = new Node(data);
        if (head == null) {
            head = newlastnode;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newlastnode;

    }

    public void print() {

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;

        }
        System.out.println("LIST HAS PRINTED");

    }

    public static void main(String[] args) {
        pract list = new pract();
        System.out.println("hello");
        list.addfirst("Parnish");
        list.addfirst("hello");
        list.addlast("gud morning ");
        list.print();

    }

}
