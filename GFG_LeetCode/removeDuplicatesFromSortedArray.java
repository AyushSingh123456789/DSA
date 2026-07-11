import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 5, 6 };
        int n = arr.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                // We move the i pointer one step forward to open up a new slot for our newly
                // found unique number.
                arr[i] = arr[j];
                // We copy the value from j and paste it into that new slot at i. This
                // effectively overwrites whatever duplicate or old data was sitting at position
                // i.
            }
        }
        System.out.println(i + 1);
    }
}
