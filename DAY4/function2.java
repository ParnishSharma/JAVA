import java.util.Scanner;
public class function2 {

    public static String name(){
     try( Scanner sc= new Scanner(System.in)){
        String myname=sc.nextLine();
        return myname;}
    }
    public static void main(String[] args){
        String result=name();
        System.out.println("Hello! , "+result);

    }
}


//usually the functions inside the memory stored in form of stack