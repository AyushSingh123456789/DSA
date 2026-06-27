/* You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element. 

Note: A possible constraint: 1 <= arr.size() <= 10^6; => Use long instead of int.
*/

import java.util.Vector;

public class MissingInArray {
    public static void main(String[] args) {

        int arr[] = { 1 };

        int n = arr.length + 1; // cause, A/q num of ele = arr.length + 1
        int sum = (n * (n + 1)) / 2; // sum of n natural numbers
        int arrSum = 0;

        for (int ele : arr) {
            arrSum += ele;
        }
        System.out.println(sum - arrSum);

        // Using Vector -:

        Vector<Integer> vec1 = new Vector<>();
        vec1.add(1);
        vec1.add(2);
        vec1.add(3);
        vec1.add(4);
        vec1.add(6);

        int n2 = vec1.size() + 1;
        int sum2 = (n2 * (n2 + 1)) / 2;
        int vecSum = 0;

        for (int i = 0; i < vec1.size(); i++) {
            vecSum = vecSum + vec1.get(i);
        }
        System.out.println("The missing element in vec1: " + (sum2 - vecSum));
    }

}
