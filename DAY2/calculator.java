import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number 1st");
         int sc1=scanner.nextInt();

        System.out.println("enter the number 2nd"); 
         int sc2 =scanner.nextInt();

        System.out.println("enter the operator 1:(+) , 2=(-) , 3=(/) , 4=(*) ");
        int ope=scanner.nextInt();
int res;
         switch(ope) {
            case 1: res=sc1+sc2;
             System.out.println(res);
                                            break;
            case 2:  res=sc1-sc2;
           System.out.println(res);
                                            break;
           case 3:  res=sc1/sc2;
            System.out.println(res);
                                            break;

           case 4:  res=sc1*sc2;
            System.out.println(res);
                                            break;
            default:
                    System.out.println("INVAILED INPUT,TRY AGAIN");


         }


    }
}
