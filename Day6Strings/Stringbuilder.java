package DAY6Strings;
import java.util.*;
public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder name=new StringBuilder("tony");
            System.out.println(name);
            System.out.println(name.charAt(1));

            int a=name.length();
           for(int i=a-1;i>=0;i--){
            System.out.print(name.charAt(i));
           }
            System.out.print("\n");


            //
             name.setCharAt(0,'k');
             System.out.println(name);

            //now if we want to shift the string
            name.insert(0,'l');
            System.out.println(name);

             name.insert(4,'n');
             System.out.println(name);

             //delete the string 

             name.delete(2,6);
             System.out.println(name);

           //appending 

           name.append("onny");
           System.out.println(name);

           //reverse a string
 



        
    }
    
}

//strings in java are immutable .data is either stored in stack in memory ormay be in a heap,
//talking about strings the string variable is stored in stack and the string letters are stored in heap 
//to improve user experience string builder is introduced
//