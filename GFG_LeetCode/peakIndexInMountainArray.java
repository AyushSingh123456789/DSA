/*You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity. */

public class peakIndexInMountainArray {
    public static void main(String[] args) {
        // int[] arr = { 0, 10, 5, 2 };
        // int[] arr = { 0, 2, 1, 0 };
        // int[] arr = { 0, 1, 0 };
        // int[] arr = { 0, 2, 3, 5, 7, 4, 1 };
        // int[] arr = { 1, 2, 3, 4, 2, 1, 0 };
        // int[] arr = { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 };
        int[] arr = { 3, 5, 3, 2, 0 };
        int n = arr.length;
        int idx = -1;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid <= 0) {
                left = mid + 1;
                right = mid + 1;
            } else if ((arr[mid] > arr[mid + 1]) && (arr[mid] > arr[mid - 1])) {
                idx = mid;
                break;
            } else if ((arr[mid] > arr[mid + 1]) && (arr[mid] < arr[mid - 1])) {
                idx = mid - 1;
                right = mid - 1;
            } else if ((arr[mid] < arr[mid + 1]) && (arr[mid] > arr[mid - 1])) {
                idx = mid + 1;
                left = mid + 1;
            }
            // } else if ((arr[mid] < arr[mid + 1]) && (arr[mid] < arr[mid - 1])) {
            // idx = mid - 1; } => Impossible condition deleted.

        }
        System.out.println("The peak index in the mountain array is: " + idx);
    }
}
