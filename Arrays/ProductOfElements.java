
//Ques: Print the Product of elements of an Array-
import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        // Taking size as Input-
        int size, product = 1;
        System.out.println("Enter the size of the array: ");
        Scanner s = new Scanner(System.in);
        size = s.nextInt();

        // Declaring an integer Array;
        int[] arr = new int[size];

        // Taking the elements as Input-
        System.out.println("Enter " + size + " elements for the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        // Calculating the Product of the elements-

        for (int j = 0; j < size; j++) {
            product = product * arr[j];
        }

        // Priting the result-
        System.out.println("The Product of the elements of the array is: " + product);
    }

}
