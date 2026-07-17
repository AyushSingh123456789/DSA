/* Given a sorted array arr[]. Find the element that appears only once in the array. All other elements appear exactly twice. */

public class singleAmongDoubles {
    public static void main(String[] args) {

        // int[] arr = { 1, 1, 2, 2, 3, 3, 4, 50, 50, 64, 64 };
        // int[] arr = { 5 };
        int[] arr = { 1, 2, 2, 3, 3 };
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.length == 1) {
                arr[left] = arr[0];
            }
            // We want mid to always be even to simplify the logic.
            // If mid is odd, decrement it by 1 to make it even.
            if (mid % 2 == 1) {
                mid--;
            }
            // If the even-indexed element matches its next neighbor,
            // the single element must lie in the right half.
            if (arr[mid] == arr[mid + 1]) {
                left = mid + 2;
            } else {
                // Otherwise, the single element is in the left half (including mid)
                right = mid;
            }
        }
        // When left == right, we've converged on the single element.
        System.out.println(arr[left]);
    }
}
