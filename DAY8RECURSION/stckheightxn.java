package DAY8RECURSION;

public class stckheightxn {

    public static int power(int a, int n) {
        if (n == 0) {
            return 1; // Any number raised to the power of 0 is 1
        }
        if (a == 0) {
            return 0; // Zero raised to any power (except 0) is 0
        }
        int npownm1 = power(a, n - 1); // Recursive call to calculate (a^(n-1))
        int npown = a * npownm1; // Calculate (a^n) using (a^(n-1))
        return npown;
    }

    public static void main(String args[]) {
        int a = 2; // Base number
        int n = 5; // Power
        int result = power(a, n);
        System.out.println(a + " raised to the power of " + n + " is: " + result);
    }
}
