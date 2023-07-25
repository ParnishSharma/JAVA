package DAY8RECURSION;

public class MaizePathMatrix {
    // Function to count all possible paths from (i, j) to (n-1, m-1) in a matrix of
    // size n x m
    public static int countpaths(int i, int j, int n, int m) {
        // Base case 1: If the current position (i, j) is out of the matrix boundary,
        // return 0
        if (i == n || j == m) {
            return 0;
        }
        // Base case 2: If the current position is the destination (n-1, m-1), return 1
        // as we have found a valid path
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Recursive call to count the number of paths going down from the current
        // position (i, j)
        int downpaths = countpaths(i + 1, j, n, m);

        // Recursive call to count the number of paths going right from the current
        // position (i, j)
        int rightpaths = countpaths(i, j + 1, n, m);

        // Total number of paths from the current position is the sum of paths going
        // down and paths going right
        return downpaths + rightpaths;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;

        // Calculate the total number of paths starting from (0, 0) to (n-1, m-1) in a
        // 3x3 matrix
        int totalpaths = countpaths(0, 0, n, m);
        System.out.println(totalpaths);
    }
}
