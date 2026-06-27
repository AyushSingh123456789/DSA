/*Ques: Find the smallest element from the array */
public class HWQues3 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, -5, -8, 0, -2 };
        int min = A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        System.out.println("The smallest element in the array is: " + min);

    }

}
