/* Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.

Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.

*/

public class maximumCountOfPosAndNegInt {
    public static void main(String[] args) {

        // int[] arr = { -2, -1, -1, 1, 2, 3 };
        // int[] arr = { -3, -2, -1, 0, 0, 1, 2 };
        int[] arr = { 5, 20, 66, 1314 };
        int left = 0;
        int right = arr.length - 1;
        int count1 = 0;
        int count2 = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > 0) {
                count1++;
                right--;
            } else if (arr[mid] <= 0) {
                count2++;
                left++;
            }
        }
        if (count1 > count2) {
            System.out.println(count1);
        } else
            System.out.println(count2);
    }
}

// Time Limit Exceeded Error on LeetCode with this one -> will optimize later.
