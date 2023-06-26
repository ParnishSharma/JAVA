public class helloworld{
    public static void main(String[] args){
        System.out.println("hello world");
          Program1 program1=new Program1();
          program1.run();
        Program2 program2 = new Program2();
        program2.run();
}


    static class Program1 {
        void run() {
            System.out.println("This is Program 1");
        }
    }

    static class Program2 {
        void run() {
            System.out.println("This is Program 2");
        }
    }
}

