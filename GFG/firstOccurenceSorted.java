
/*Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1. 

Note: If multiple occurrences are there, please return the smallest index. */
import java.util.Scanner;

public class firstOccurenceSorted {
    static int isPresent(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int idx = -1;
        boolean flag = false;
        int target;
        System.out.println("Enter the target integer element: ");
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();

        while (left <= right) {
            int mid = (left + right / 2);
            if (arr[mid] > target)
                right = mid - 1;
            else if (arr[mid] < target)
                left = mid + 1;
            else { // arr[mid] == target
                idx = mid;
                right = mid - 1;
                flag = true;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 34, 55, 67, 80 };
        int result = isPresent(arr);
        System.out.println(result);
    }
}
