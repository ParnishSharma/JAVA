package OOPSJAVA;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing");
    }

    public void printtype() {
        System.out.println(this.type);
    }

}

public class ClassandObjects {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "0.5mm Gel";
        pen1.write();
        pen1.printtype();
    }

}
