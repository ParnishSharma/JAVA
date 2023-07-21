package DAY8RECURSION;

public class StrictlyIncreasing {
    public static boolean isStrictlyIncreasing(int[] arr, int i) {
        if (i == arr.length - 1) {
            System.out.println("It is strictly increasing.");
            return true;
        }

        if (arr[i] >= arr[i + 1]) {
            System.out.println("It is not strictly increasing.");
            return false;
        } else {
            return isStrictlyIncreasing(arr, i + 1);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 2, 7, 8, 9 };
        boolean result = isStrictlyIncreasing(arr, 0);
        System.out.println(result);
    }
}
