/* Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place). In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on. If there are multiple solutions, find the lexicographically smallest one.

Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array. */

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        // My Method:

        int a = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i == a) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                a = a + 2;
            }
        }
        System.out.println(Arrays.toString(arr));

        // Sir's Method:

        int arrr[] = { 1, 2, 3, 4, 5 };
        for (int m = 0; m < n - 1; m = m + 2) {
            int temp = arrr[m];
            arrr[m] = arrr[m + 1];
            arrr[m + 1] = temp;
        }
        System.out.println(Arrays.toString(arrr));
    }
}
