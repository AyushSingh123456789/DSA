/* Given an array arr[] consisting of only 0's and 1's. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

Examples :

Input: arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 0, 0, 1, 1, 1, 1, 1].
Input: arr[] = [1, 1]
Output: [1, 1]
Explanation: There are no 0s in the given array, so the modified array is [1, 1] */

import java.util.Arrays;

public class Segregate0sAND1s {
    public static void main(String[] args) {

        // Method1: Two-Pointers:

        int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Increment left while we see 0s
            while (arr[left] == 0 && left < right) { // Here, we can use "if" statement also
                // if(arr[left] == 0)
                left++;
            }
            // Decrement right while we see 1s
            while (arr[right] == 1 && left < right) { // Here, we can also use "else if" statement
                // else if(arr[right] == 1)
                right--;
            }

            // If left is still less than right, we found a 1 at left
            // and a 0 at right, so swap them.

            if (left < right) { // we can also use "else" statement
                // else
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        // Method2: Counting 0s and 1s:

        int numofZ = 0;
        int numofO = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                numofZ++;
            } else {
                numofO++;
            }
        }
        for (int n = 0; n < numofZ; n++) {
            arr[n] = 0;
        }
        for (int m = numofZ; m < arr.length; m++) {
            arr[m] = 1;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }

}
