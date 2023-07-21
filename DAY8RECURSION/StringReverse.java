package DAY8RECURSION;

public class StringReverse {

    public static void StringRev(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        StringRev(str, index - 1);
    }

    public static void main(String args[]) {
        String str = "nullify";
        StringRev(str, str.length() - 1);

    }

}
