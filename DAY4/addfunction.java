import java.util.*;
import java.util.Scanner;

public class addfunction {
public static int numbers(int a ,int b){
int result =a+b;
return result;
}

public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
       int num2= sc.nextInt();
    int sum=   numbers(num1, num2);
    System.out.println("SUM IS  "+sum);

    }
    
}
