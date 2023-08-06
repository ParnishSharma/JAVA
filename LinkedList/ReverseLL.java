package LinkedList;

import java.util.LinkedList;

public class ReverseLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Parnish");
        list.add("is");
        list.add("this");
        list.add("hello,");
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + "->");
        }

    }

}
