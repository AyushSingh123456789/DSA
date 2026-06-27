import java.util.Arrays;

/* Time complexity = O(n) + O(nlogn) = O(nlogn) */
public class twoSumOptimised {
    public static void main(String[] args) {
        int[] arr = { 1, 0, -2, 5, 3, 7, 4 };
        int n = arr.length;
        int target = 8;

        Arrays.sort(arr); // arr = {-2,0,1,3,4,5,7}; Time complexity = O(nlogn);
        int i = 0;
        int j = n - 1;
        int x = 0, y = 0;
        // Can also use boolean flag method to chek whether target is achieved or not

        while (i < j) { // time complexity = O(n);
            if (arr[i] + arr[j] > target) {
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else if (arr[i] + arr[j] == target) {
                x = i;
                y = j;
                break;
            }
        }
        if (x == 0 && y == 0) {
            System.out.println("The resultant value cannot be achieved using these indexed elements");
        } else {
            System.out.println("The required indexes are: " + x + " , " + y);
        }
    }
}
