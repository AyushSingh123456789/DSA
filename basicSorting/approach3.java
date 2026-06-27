// Bubble Sort(Better version) : Time complexity = O(n^2) OR O(n)[if the array is already sorted]

public class approach3 {
    static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, -2, 3, 5, 4 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted == true) {
                break; // this breaks the outer for-loop(parent loop)
            }
        }
        print(arr);
    }
}
