import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 8, -3 };
        meT(arr);
    }

    public static boolean meT(int[] arr) {
        int target;
        System.out.println("Enter the integer target sum: ");
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();

        // int[] arr = { 1, 5, 8, -3 }; No need for this, arr sent & received using
        // method call

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("2 Sum successfuly returns the target value b/w the elements present at index "
                            + i + " and " + j);
                    return true;
                    /*
                     * when this gets true, the whole method is suspended, and the program returns
                     * back to the main method
                     */
                }
            }
        }
        System.out.println("2 Sum is Unsuccessful, as no two values in this array sum upto form the target");
        return false; // if nothing b/w the two loops returns true, then this statement returns false

        /*
         * Note: It's always a good idea to put the print statement before the return
         * statement if we want to print something, Or else the method terminates after
         * the return statement.
         */

    }
}
