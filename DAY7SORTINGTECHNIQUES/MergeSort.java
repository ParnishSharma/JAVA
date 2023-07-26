package DAY7SORTINGTECHNIQUES;

public class MergeSort {

    // Helper method to merge two sorted sub-arrays into one sorted array
    public static void conquer(int arr[], int mid, int si, int ei) {
        // Create a temporary array to store the merged values
        int merge[] = new int[ei - si + 1];
        int i1 = si; // Index for the first sub-array
        int i2 = mid + 1; // Index for the second sub-array
        int x = 0; // Index for the temporary merge array

        // Compare elements from both sub-arrays and put them in sorted order in the
        // merge array
        while (i1 <= mid && i2 <= ei) {
            if (arr[i1] < arr[i2]) {
                merge[x++] = arr[i1++];
            } else {
                merge[x++] = arr[i2++];
            }
        }

        // Copy any remaining elements from the first sub-array
        while (i1 <= mid) {
            merge[x++] = arr[i1++];
        }

        // Copy any remaining elements from the second sub-array
        while (i2 <= ei) {
            merge[x++] = arr[i2++];
        }

        // Copy the sorted values from the merge array back to the original array
        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    // Recursive method to divide the array into smaller sub-arrays
    public static void divide(int arr[], int si, int ei) {
        // Base case: If the sub-array has zero or one element, it's already sorted
        if (si >= ei) {
            return;
        }

        // Calculate the middle index
        int mid = (si + ei) / 2;

        // Recursively divide the left half of the array
        divide(arr, si, mid);

        // Recursively divide the right half of the array
        divide(arr, mid + 1, ei);

        // Merge the two sorted halves
        conquer(arr, mid, si, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 7, 8, 65, 55, 9 };
        int n = arr.length;

        // Call the divide method to sort the array using Merge Sort
        divide(arr, 0, n - 1);

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
