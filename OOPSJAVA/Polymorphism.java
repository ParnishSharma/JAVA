package OOPSJAVA;

class stud {
    String name;
    int roll;

    public void printinfo(String name) {
        System.out.println(name);
    }

    public void printinfo(int roll) {
        System.out.println(roll);
    }

    public void printinfo(String name, int roll) {
        System.out.println(name + " has " + roll);
    }
}

public class Polymorphism {

    public static void main(String args[]) {
        stud s = new stud();
        s.name = "anil";
        s.roll = 22;

        s.printinfo(s.name, s.roll);
        s.printinfo(55);
        s.printinfo("akshaj");

    }
}
//for diff function there should be diffrent wrgument type or number of argumantes etc
