import java.util.Collections;
import java.util.Vector;

/* Given a non-negative integer(without leading zeroes) represented as an array arr. Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array. */

public class Adding1 {
    public static void main(String[] args) {
        int[] arr = { 9, 9, 9 };
        int n = arr.length;

        Vector<Integer> ans = new Vector<>();
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            } else { // arr[i] + carry = 10
                ans.add(0);
                carry = 1;
            }
        }
        if (carry == 1) // E.g case: [9,9,9]; // carry is still left as '1', so add it to the Vector.
        {
            ans.add(carry);
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
