package OOPSJAVA;

class stud {
    String name;
    int roll;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.roll);
    }

    stud(stud s2) {
        this.name = s2.name;
        this.roll = s2.roll;
    }

    stud() {
    }
}

public class copyconstructors {

    public static void main(String[] args) {
        stud s1 = new stud();
        s1.name = "aman";
        s1.roll = 24;

        stud s2 = new stud(s1);
        s2.printinfo();

    }

}
