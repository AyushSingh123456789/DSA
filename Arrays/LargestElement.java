
//Ques- Print the Largest element from the Array;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        // taking size input from the user-

        int size;
        System.out.println("Enter the size of the array: ");
        Scanner s = new Scanner(System.in);
        size = s.nextInt();

        // Declaring the Integer array-
        int[] arr = new int[size];

        // Taking elements input from the user-
        System.out.println("Enter " + size + " elements for the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        // Finding the largest element-
        // int max = arr[0];
        int max = Integer.MIN_VALUE; // MIN_VALUE = -2^31
        for (int j = 0; j < size; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
            // NO need for else statement, as it will reset the values to max = arr[0],
            // everytime the element > arr[0] but not greater than the new max found inside
            // the array.
        }

        // Printing the Largest Element-
        System.out.println("The Largest Element in this array is: " + max);
    }

}
