package LinkedList;

public class uniquelementssum {
    public int sum(int arr[]) {

        int total = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (i == j) {
                    total = total + arr[i];
                    break;
                }
                if (arr[i] == arr[j] && arr[i] == arr[i + 1] && arr[j] == arr[j - 1]) {

                } else {
                    total = arr[i] + arr[j];

                }

            }
        }
        return total;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 1, 3, 3 };
        uniquelementssum obj = new uniquelementssum();
        int result = obj.sum(arr);
        System.out.println("Total sum of all pairs in the array: " + result);
    }

}
