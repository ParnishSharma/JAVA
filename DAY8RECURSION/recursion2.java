package DAY8RECURSION;

public class recursion2 {

    public static void number(int i) {
        i--;
        if (i == 0) {
            System.out.println("done");
        } else {
            System.out.println(i);
            number(i);
        }
    }

    public static void main(String args[]) {
        int i = 5;
                    System.out.println(i);
        number(i);
    }
}
