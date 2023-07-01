// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class ifelse {   

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (var2 > 18) {
         System.out.println("As your age is " + var2 + " you are eligible for voting ");
      } else {
         System.out.println("As your age is " + var2 + " you are not eligible for voting ");
      }

   }
}
