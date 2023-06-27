import java.util.Scanner;

public class userinput {

    public static void main(String [] args){
    try (   Scanner scanner= new Scanner(System.in)){
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int sum=num1+num2;
        System.out.println("the sum is " +sum);
    }
}
}