
//Ques: Print the smallest element from the Array-
import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        // Taking size from the user-
        int size;
        System.out.println("Enter the size of the Array: ");
        Scanner s = new Scanner(System.in);
        size = s.nextInt();

        // Declaring the Array-
        int[] arr = new int[size];

        // Taking elements inside the array-
        System.out.println("Enter " + size + " elements for the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        // Smallest Element inside the array-:
        int min = Integer.MAX_VALUE; // MAX_VALUE = (2^31) - 1

        for (int j = 0; j < size; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("The Smallest element in the array is: " + min);
    }

}
