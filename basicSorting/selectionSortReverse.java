/* Sort an Array in descending order using selection sort: */

public class selectionSortReverse {
    static void sS(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");
    }

    public static void main(String[] args) {
        int[] arr = { -2, 5, 3, 6, 1, 0, 2, 5 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;
            int maxdx = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = max;
            arr[maxdx] = temp;
        }
        sS(arr);
    }
}
