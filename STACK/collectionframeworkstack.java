package STACK;

import java.util.Stack;

public class collectionframeworkstack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(1);
        s.push(33);
        s.push(44);
        s.push(132);
        s.push(12);
        int i = 0;
        Integer elementToPrint = null;
        while (!s.isEmpty()) {
            if (i == 3) {
                elementToPrint = s.peek();
            }
            s.pop();

            i++;
        }
        if (elementToPrint != null) {
            System.out.println("Element at index 3: " + elementToPrint);
        }
    }

}
