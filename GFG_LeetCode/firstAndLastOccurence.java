// Using Binary Search to find the index of first and last occurence of an elem.

public class firstAndLastOccurence {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int target = 5;
        int left = 0;
        int right = arr.length - 1;
        int idx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target)
                right = mid - 1;
            else if (arr[mid] < target)
                left = mid + 1;
            else if (arr[mid] == target) {
                idx = mid;
                right = mid - 1; // right is looking for the first occurence, while being >= left
            } else {
                System.out.println(target + " is not present inside this array");
            }
        }
        int result1 = idx;
        left = 0;
        right = arr.length - 1;
        idx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target)
                right = mid - 1;
            else if (arr[mid] < target)
                left = mid + 1;
            else if (arr[mid] == target) {
                idx = mid;
                left = mid + 1; // left is looking for the last occurence, while being <= right
            } else {
                System.out.println(target + " is not present inside this array");
            }
        }
        int result2 = idx;

        System.out.println(
                "The first and last occuring indexes for the target " + target + " are: " + result1 + " , " + result2);
    }
}
