// Bubble Sort(Type-1): Time Complexity = O(n^2)

public class basics1 {
    static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, -5, 7, 3, 2, 6, 0, 5 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // 0,1,2,3,4,5,6,7,8 OR if i=1 => 1,2,3,4,5,6,7,8,9 = Same
            for (int j = 0; j < n - 1; j++) { // (n-1) passes for both loops => Total num of operations = (n-1)^2
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
