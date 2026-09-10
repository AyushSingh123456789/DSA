/* You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build. */

import java.util.Scanner;

public class arrangeCoins {
    public static void main(String[] args) {
        System.out.println("Enter the number of coins: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of coins

        long left = 0;
        long right = n;
        long ans = 0;

        while (left <= right) {
            long k = left + (right - left) / 2;
            long m = k * (k + 1) / 2;
            if (m == n) {
                ans = k;
                break;
            } else if (m > n) {
                right = k - 1;
            } else {
                ans = k;
                left = k + 1;
            }
        }
        System.out.println("Number of rows needed: " + (int) ans);
    }
}
