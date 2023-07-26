package DAY7SORTINGTECHNIQUES;

public class QuickSort {

    // Partition function to rearrange the elements around the pivot
    // so that elements smaller than the pivot are on its left and
    // elements greater than the pivot are on its right.
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Choosing the rightmost element as the pivot
        int i = low - 1; // Index of smaller element

        // Traverse the array from 'low' to 'high-1'
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                // If current element is smaller than the pivot,
                // swap the elements at 'i+1' and 'j'
                i++;
                int temp = arr[i]; // { 6, 2, 1, 5, 7, 8, 17 };
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot (arr[high]) to its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the index of the pivot after partitioning
        return i + 1;
    }

    // QuickSort function to recursively sort the array
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // Find the partition index (pindex) using partition function
            int pindex = partition(arr, low, high);

            // Recursively call quickSort on the left and right subarrays
            quickSort(arr, low, pindex - 1); // Sort left subarray before pivot
            quickSort(arr, pindex + 1, high); // Sort right subarray after pivot
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 1, 5, 7, 8, 17 }; // total 8 elements 0 to 7 indexes
        int n = arr.length;

        // Sort the array using QuickSort
        quickSort(arr, 0, n - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
