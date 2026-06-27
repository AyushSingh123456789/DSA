//Ques: Linear Search for an element in an Array

import java.util.Scanner;

public class HWQues2 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        // Taking elements for arr as input from user-:
        System.out.println("Enter 4 integer elements for the array: ");
        for (int i = 0; i < arr.length; i++) {
            Scanner s = new Scanner(System.in);
            arr[i] = s.nextInt();
        }
        // displaying the elements from the array for choosing-:
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        LSearch(arr);
    }

    public static void LSearch(int[] a) {
        // User choosing the element from arr to know it's index-:
        System.out.println("Choose from the above elements: ");
        int n;
        Scanner s1 = new Scanner(System.in);
        n = s1.nextInt();
        boolean flag = false; // avoiding repeatition of else block
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                System.out.println("Index: " + i);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(n + " is not present in this Array");
        }
    }
}
