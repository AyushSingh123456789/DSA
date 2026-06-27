
/*Print Sum of Elements of an Array */
import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {

        // Size input from the User-
        int size, sum = 0;
        System.out.println("Enter the size of the array: ");
        Scanner s = new Scanner(System.in);
        size = s.nextInt();

        // Array of size "size" declaration
        int[] arr = new int[size];

        // Elements input from the User-
        System.out.println("Enter " + size + " elements for the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        // Summation of Elements of the Array-
        for (int j = 0; j < size; j++) {
            sum = sum + arr[j];
        }

        // Printing the sum value-
        System.out.println("The sum of the elements of the array is: " + sum);

    }

}
