/* Ques: Multiply Odd Indexed Elements by 2 and Add 10 to Even Indexed Elements */

public class HWQues1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + " ");
        }
        operation(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void operation(int y[]) {
        for (int i = 0; i < y.length; i++) {
            if (y[i] % 2 != 0) {
                y[i] = y[i] * 2;
            } else {
                y[i] = y[i] + 10;
            }
        }
    }

}
