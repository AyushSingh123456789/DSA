/*  Insertion Sort:
Auxilary space: O(1);
Worst Case/Avg Case: O(n^2); // Array is sorted in descending order
Best Case: O(n); // Array is already sorted
*/

public class insertionSort {
    public static void main(String[] args) {

        int[] arr = { 2, -5, 6, 3, 1, 4, 3 };
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
