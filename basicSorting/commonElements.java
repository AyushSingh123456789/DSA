import java.util.Arrays;
import java.util.ArrayList;

public class commonElements {
    public static void main(String[] args) {
        int[] arr1 = { 3, 4, 2, 2, 6, 7 };
        int[] arr2 = { 1, 2, 2, 3, 5 };
        int n = arr1.length;
        int m = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                ans.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(ans);
    }
}
