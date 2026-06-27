//import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, 6, 3, -2, 5 };
        secondL(arr);

        /*
         * Method-2(Only works if there is no Repeatition of Elements): Solve by first
         * sorting the array, print the second last element.
         * 
         * int[] B = { 1, 2, -4, 6, 3, -2, 5 };
         * Arrays.sort(B);
         * int n = B.length - 2; // Second-last element
         * System.out.println("The Second largest element in the array is: " + B[n]);
         */
    }

    public static int secondL(int[] A) {
        if (A.length < 2) {
            return -1;
        }
        int max1 = A[0];
        int max2 = -1;

        for (int i = 1; i < A.length; i++) {

            if (A[i] > max1) {
                max2 = max1; // max1 ka prev value max2 ko
                max1 = A[i]; // naya bigger value max1 le lega
            } else if (A[i] > max2 && A[i] < max1) {
                max2 = A[i];
            }
        }
        System.out.println("The Second Largest Element in the array is: " + max2);
        return max2;

    }

}
