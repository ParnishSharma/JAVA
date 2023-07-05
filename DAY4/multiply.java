import java.util.*;


public class multiply {

    public static int multiply(int a, int b){
        int result1=a*b;
        return result1;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int mul=multiply(num1, num2);
System.out.println(mul);
    }
    
}
