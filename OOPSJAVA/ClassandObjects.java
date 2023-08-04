package OOPSJAVA;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing");
    }

    public void printtype() {
        System.out.println(this.type);// to print the specific property
    }

    Pen(String color, String type) {
        this.color = color;
        this.type = type;
        System.out.println(color + " ," + type);
    }

}

public class ClassandObjects {
    public static void main(String[] args) {
        Pen pen1 = new Pen("ball", "gel");

    }

}
