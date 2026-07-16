/* Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.

Note: In case of multiple occurrences of floor of x, return the index of the last occurrence.

Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
Output: 1
Explanation: Largest number less than or equal to 5 is 2, whose index is 1.

*/

public class floorInASortedArray {
    public static void main(String[] args) {

        // int[] arr = { 1, 2, 8, 10, 10, 12, 19 };
        // int target = 5;
        int[] arr = { 1, 2, 8, 10, 10, 12, 19 };
        int target = 11;
        int idx = -1;
        // We know that: left = mid+1 => condition for last occurence, right = mid-1 =>
        // condn. for first occurence

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target)
                right = mid - 1;
            else if (arr[mid] < target) {
                idx = mid;
                left = mid + 1;
            } else if (arr[mid] == target) {
                idx = mid;
                left = mid + 1;
            }
        }
        System.out.println(idx);

    }
}
