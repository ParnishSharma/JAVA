package DAY5;
import java.util.*;

public class arra2d {
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in);){
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] array=new int[n][m];

        for(int i =0 ;i<n;i++){
            for(int j=0;j<m;j++){
             array[i][j] =sc.nextInt();
            }

        }
           for(int i =0 ;i<n;i++){
            for(int j=0;j<m;j++){
           System.out.print(array[i][j]+" ");

            }
           System.out.print("\n");


        }

    }
}
}
