/* Ques: Given an integer array, arr = {3,19,56,9,83,18,24,85,14}, Swap all the elements present b/w index i = 2 to i = 5, leave everything else as it is, and then display the elements of the array */

public class HWQues4 {
    public static void main(String[] args) {
        int[] arr = { 3, 19, 56, 9, 83, 18, 24, 85, 14 };
        System.out.println("Initial array elements-: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        int i = 2;
        int j = 5;

        while (i < j) {
            // Swapping
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println();
        System.out.println("Final Array Elements-: ");
        for (int u : arr) {
            System.out.print(u + " ");
        }
    }
}
