package DAY8RECURSION;

public class fibonaccisiries {

    public static void printfib(int x, int y, int n) {
        if (n == 0) {
            return;

        }
        int z = x + y;
        System.out.print(z + " ");
        printfib(y, z, n - 1);
        System.out.println(y);

    }

    public static void main(String args[]) {
        int n = 7, a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        printfib(a, b, n - 2);
    }
}
