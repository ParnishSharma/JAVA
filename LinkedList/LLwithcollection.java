package LinkedList;

import java.util.LinkedList;

public class LLwithcollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Parnish");
        list.add("is");

        list.add("Writing ");

        list.add("this");
        System.out.println(list);
        System.out.println(list.size());
        list.remove("this");
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == "is") {
                list.remove();
            }
            System.out.print(list.get(i) + "->");
        }
        System.out.println("null");

    }

}
