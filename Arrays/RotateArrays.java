public class RotateArrays {
    public static void main(String[] args) {
        // Method-1: Creating another Array

        int[] arr = { 6, 8, 1, 2, 4, 9, 0 };
        // Given d = 3; i.e 3 rotations => Move the first 3 elements to the last

        int[] arrr = new int[7];
        System.out.println("Initial array elements-: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        int j = 3;
        int l = 0;

        for (int i = 0; i < 3; i++) {
            arrr[i] = arr[j];
            j++;
        }
        for (int k = 4; k < arrr.length; k++) {
            arrr[k] = arr[l];
            l++;
        }
        System.out.println();
        System.out.println("Final array elements-: ");
        for (int y : arrr) {
            System.out.print(y + " ");
        }

        // Method2: Using Reversing(The Preferred Method)-: Also known as Left Rotation
        // of elements

        /*
         * i) Do the d = d % n, as it ensures that the rotation count d is within the
         * bounds of the array length n, preventing unnecessary full rotations. This
         * normalizes d to a value between 0 and n-1, making the rotation efficient by
         * avoiding redundant shifts.
         */
        /* ii) Reverse the elements from i = 0 to i = d - 1;(d->first d elements) */
        /*
         * iii) Reverse the all the rest of the elements from i = d to i = arr.length-1
         */
        /* iv) Reverse the whole array from i = 0 to i = arr.length - 1; */

        int[] A = { 6, 8, 1, 2, 4, 9, 0 };
        int d = 9;
        int n = A.length;
        System.out.println();
        System.out.println("Intial Elements inside array: ");
        for (int x : A) {
            System.out.print(x + " ");
        }

        /*
         * Step1: Ensuring that d < n, so it works on Normalization: This operation
         * normalizes d to a value between 0 and n-1. For example, if you have an array
         * of length 5 and you want to rotate it by 7 positions, the effective rotation
         * is actually 7 % 5 = 2. This means rotating by 7 is equivalent to rotating by
         * 2.
         */

        d %= n;

        // Step2: Reversing the first 'd' elements(0 to d-1)
        reverse(A, 0, d - 1);

        // Step3: Reversing the rest of the element(d to n-1)
        reverse(A, d, n - 1);

        // Step4: Reversing the whole array(0 to n-1)
        reverse(A, 0, n - 1);

        System.out.println();
        System.out.println("Final Elements of the array: ");
        for (int y : A) {
            System.out.print(y + " ");
        }
    }

    public static void reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }

}
