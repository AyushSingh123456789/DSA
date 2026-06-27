/* Before Learning about two pointers technique, We should must be familiar with the concept of Swapping two Numbers, which is done in the following manner-:
Consider a and b as two numbers,
i) int temp = a; 
ii) a = b;
iii) b = temp;
 */

public class ReverseArrayTwoPointers {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 1, 2, 4, 9, 0 };
        System.out.println("Initial Elements-: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Using Bit-wise Operator for swapping (XOR)-:

            // arr[i] = arr[i] ^ arr[j];
            // arr[j] = arr[i] ^ arr[j];
            // arr[i] = arr[i] ^ arr[j];
            i++;
            j--;
        }
        System.out.println();
        System.out.println("Final Elements-: ");
        for (int y : arr) {
            System.out.print(y + " ");
        }

        // Method 2 for Reversing an Array-:

        int[] arrr = { 1, 23, 45, 76, 8, 44, 66 };
        int m = arrr.length;
        System.out.println();
        System.out.println("Initial Array-: ");
        for (int p : arrr) {
            System.out.print(p + " ");
        }

        for (int k = 0; k < m / 2; k++) {
            /*
             * if we use k < m instead of k < m/2, the swapping of elements would have
             * happened twice instead of once, and no change would've happened.
             */

            // swap arrr[k] and arrr[m-1-i]

            int temp2 = arrr[k];
            arrr[k] = arrr[m - 1 - k];
            arrr[m - 1 - k] = temp2;
        }
        System.out.println();
        System.out.println("Final Array-: ");
        for (int q : arrr) {
            System.out.print(q + " ");
        }

        /*
         * Another method which is not recommended, but can be used to reverse an array
         * is, Creating a 2nd array, and filling the elements from this 1st array inside
         * the 2nd array in reverse Order.
         */

    }

}
