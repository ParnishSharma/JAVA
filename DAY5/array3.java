package DAY5;

import java.util.*;

public class array3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();

        int[] list = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            list[i] = sc.nextInt();

        }
        for (i = 0; i <= n - 1; i++) {
            if (list[i] == f) {
                System.out.println("Number is at index =" + i);
            }

        }

    }

}
