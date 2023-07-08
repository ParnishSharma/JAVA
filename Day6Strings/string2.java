package DAY6Strings;

public class string2 {
    public static void main(String args[]) {
        String name1 = "t";
        String name2 = "t";

        
        //compareTo compares the alphabets too
        // compareTo returns:
        // positive value if name1 > name2
        // 0 if name1 == name2
        // negative value if name1 < name2

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
