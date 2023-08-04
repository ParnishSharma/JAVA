package OOPSJAVA;

//ek class ki properties dusri class lena chahti h
//total 5 types single level, multiple ,multilevel, hirerchial,hybrid

class shape{
public void area(){
    System.out.println("display area");
}    
}

class triangle extends shape{
public void area(int l,int h) {
        System.out.println("Area of triangle: " + 0.5 * l * h);
}
}

public class Inheritence {
   public static void main(String[] args) {
     triangle t1=new triangle();
     t1.area(3, 4);
   }

    
}
