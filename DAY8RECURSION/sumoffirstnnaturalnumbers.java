package DAY8RECURSION;

import java.util.*;

public class sumoffirstnnaturalnumbers {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int p = sum(t);
        System.out.println(p);
    }

}
