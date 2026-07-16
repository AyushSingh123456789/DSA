
/* Using Binary Search:  Time Complexity = O(log n)  
  Time Limit Exceeded error on LeetCode -> change 'int' variables to 'long' and return with 'int' typeCasting.
                                   OR change the two things below:
  Time Limit Exceeded error on LeetCode -> change mid from (l+r)/2 => l + (r-l)/2
  Time Limit Exceeded error on LeetCode -> change (mid * mid) <>= n => (mid) < > = n/mid

*/
import java.util.Scanner;

public class squareRootApproach2 {
    static int floatRoot(int n) {
        int left = 1;
        int right = n;
        // int root = 0;
        if (n == 0)
            return 0; // Avoiding the Zero division error, so starts from left = 1
        while (left <= right) {
            int mid = left + (right - left) / 2; // the new Optimized mid for avoiding integer Overflow
            // if (mid * mid > n) {
            if (mid > n / mid) { // optimized condns:
                right = mid - 1;
            } // else if (mid * mid < n) {
            else if (mid < n / mid) {
                // root = mid;
                left = mid + 1;
            } else {
                // root = mid;
                // break;
                return mid;
            }
        }
        return right;

        /*
         * On a Second thought, we don't need another variable 'root', we can just
         * return the highest value less than or equal to root n.
         */
    }

    public static void main(String[] args) {
        System.out.println("Enter the num you want root of: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = floatRoot(n);
        System.out.println(result);
    }

}
