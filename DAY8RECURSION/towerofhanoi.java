package DAY8RECURSION;

public class towerofhanoi {
    public static void main(String[] args) {
        int n = 2; // Number of disks
        hanoi(n, "src", "h", "d"); // Call the hanoi function to solve the problem
    }

    public static void hanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            // Base case: If there is only one disk, move it from the source to the
            // destination
            System.out.println("Transfer disk from " + source + " to " + destination);
            return;
        }

        // Move (n-1) disks from source to helper using destination as the auxiliary
        // tower
        hanoi(n - 1, source, destination, helper);

        // Move the remaining largest disk from source to destination
        System.out.println("Transfer disk from " + source + " to " + destination);

        // Move (n-1) disks from helper to destination using source as the auxiliary
        // tower
        hanoi(n - 1, helper, source, destination);
    }
}

// time compelexity is 2^n