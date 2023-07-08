package DAY6Strings;

public class string1 {
    public static void main(String args[]) {
        int n=0;
        String name = "tonymontanna";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                System.out.println(i);
                n++;
                
            }
        }
                     System.out.println("Number of times it is coming "+n);
   
    }
}
