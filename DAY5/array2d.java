package DAY5;

import java.util.Scanner;

public class array2d {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.print("enter the number to search: ");

            int find = sc.nextInt();
            int[][] array = new int[n][m];

            System.out.print("\n");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = sc.nextInt();
                }

            }
            System.out.print("\n");

            System.out.print("Array so formed is : \n");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(array[i][j] + " ");

                }
                System.out.print("\n");
            }

            System.out.print("\n");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (array[i][j] == find) {
                        System.out.println("The number is at " + i + "row and " + j + "column");
                    }
                }

            }

        }

    }
}