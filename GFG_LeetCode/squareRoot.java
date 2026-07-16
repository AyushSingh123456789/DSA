/* Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.

Floor value of any number is the greatest Integer which is less than or equal to that number.

Input: n = 4
Output: 2
Explanation: Since, 4 is a perfect square, so its square root is 2.

Using Brute Force Method: Time Complexity = O(root n) => the control in the hands of if condn. inside the for loop*/

import java.util.Scanner;

public class squareRoot {
    static int floorRoot(int n) {
        int root = 0;
        // Root of any num is less than the number itself.
        // and, if a num 'i' is the sq root of a num 'n' => (i*i = n) OR (i * i <= n)
        // will do too.
        for (int i = 1; i <= n; i++) {
            if (i * i > n)
                break;
            root = i;
        }
        return root;
    }

    public static void main(String[] args) {
        System.out.println("Enter the num you want sq root of: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = floorRoot(n);
        System.out.println(result);
    }
}
