// Bubble Sort(best approach): Time complexity = O(n^2)[Avg and Worst Case] OR O(n)[Best Case: f the array is already sorted]

public class approach4 {
    static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 2, -4, 1, 5, 0, 3, 4 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                // upper inner for loop complete hone ke baad, if still swap = 0 => Sorted
                // array, Hence break
                break;
            }
        }
        print(arr);
    }
}
