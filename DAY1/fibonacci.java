import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){
 Scanner scanner =new Scanner(System.in);  
     System.out.println("Enter the number:");
    int num = scanner.nextInt();
       
        for (int i = 0; i < num; i++) {
System.out.println(fab(i)+"");
        }

    scanner.close();
    }

    public static int fab(int n){
        if (n<=1){
            return n;
        }
return fab(n-1)+fab(n-2);
    }
}


