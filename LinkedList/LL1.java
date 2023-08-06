package LinkedList;

//list of elements or nodes and the are related 
//non contigous memeory linkedlist is usefull when we have to perform the insert element
//node has two parts 1.data 2.next

public class LL1 {
    Node head;
    private int size; // check the size of node

    LL1() {
        this.size = 0;

    }

    class Node { // create a node which is having two things data and next and as next will be
                 // pointing to another node
        // thus its variable type would be node
        String data;
        Node next;

        Node(String data) { // declare the structure values //creating a constructor
            this.data = data;
            this.next = null; // as it is the first node and not pointing to any other node so the value would
            size++; // be null

        }
    }

    public void addfirst(String data) {
        Node newnode = new Node(data);// we will create a new node to store the data
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head; // we will update the head and newnode added will be the head as we aare adding
                             // this node in the first
        head = newnode;

    }

    public void addlast(String data) {
        Node newnode = new Node(data); // Create a new node with the provided data.
        if (head == null) { // Check if the list is empty (head is null).
            head = newnode; // If the list is empty, make the new node the head of the list.
            return; // Exit the method as the node has been added to an empty list.
        }
        Node currNode = head; // Start iterating from the head of the list.
        while (currNode.next != null) { // Loop until we reach the last node in the list.
            currNode = currNode.next; // Move to the next node in the list.
        }
        currNode.next = newnode; // Link the new node as the next node of the current last node.
    }

    public void println() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            if (currNode.next != null) {
                System.out.print(" -> ");
            }
            currNode = currNode.next;
        }
    }

    public void delete(String data) {
        if (head == null) {
            return;

        }

        Node currNode2 = head;
        Node currNode3 = head.next;
        while (currNode3 != null) {

            if (currNode3.data.equals(data)) {
                currNode2.next = currNode3.next;
                currNode3.next = null;
                size--;
            }
            currNode3 = currNode3.next;
            currNode2 = currNode2.next;

        }

    }

    public void getsize() {
        System.out.println(size);
        return;
    }

    public static void main(String[] args) {
        LL1 list = new LL1();

        list.addfirst("a");
        list.addfirst("is");
        list.addfirst("this");
        list.addlast("list");
        list.println();
        System.out.println("\n size is:");

        list.getsize();
        list.delete("list");
        System.out.println(" \n");
        System.out.println("After deleting ");
        list.println();
        System.out.println("\n size is:");

        list.getsize();

    }
}
