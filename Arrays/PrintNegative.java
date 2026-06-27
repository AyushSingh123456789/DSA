// Ques: Given an array, print negative elements only.

import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args) {
        int m;
        System.out.println("Enter the size of the Array: ");
        Scanner ss = new Scanner(System.in);
        m = ss.nextInt();

        int[] A = new int[m];
        System.out.println("Enter " + m + " Array Elements: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = ss.nextInt();
        }

        boolean flag = false; // declared a boolean flag to handle the repeatition of statements
        System.out.print("The Negative elements are: ");
        for (int n = 0; n < A.length; n++) {

            if (A[n] < 0) {
                System.out.print(A[n] + "," + " ");
                flag = true;
            }
        }
        if (!flag) {// if the flag is false
            System.out.println("No Negative element in this array");
        } else {
            System.out.println();
        }
    }

}
