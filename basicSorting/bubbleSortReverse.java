/* HW Question: Sort an array in Descending Order using bubble Sort: */

public class bubbleSortReverse {
    static void bS(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, -5, -6, 12, 3 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
        bS(arr);
    }
}
