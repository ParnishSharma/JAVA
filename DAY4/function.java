import java.util.Scanner;

public class function {
    public static String myname() {
        Scanner sc = new Scanner(System.in);
        String num2 = sc.nextLine();
        return num2;
    }

    public static void main(String[] args) {
        String greet = "hey";
        String result = myname();

        System.out.println(greet+" "+result);
    }
}
