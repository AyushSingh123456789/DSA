import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { -44, -33, -27, 15, 20, 40, 52, 65 };
        int n = arr.length;
        int target = 20;
        boolean isPresent = false;

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) {
                isPresent = false;
                right = mid - 1;
                /*
                 * mid element jo hai woh target se bada hai, toh uske right mein saare elements
                 * bhi bade honge, toh searching iss mid element ke ek pehle hi end kar do
                 */
            } else if (arr[mid] < target) {
                isPresent = false;
                left = mid + 1;
                /*
                 * mid element jo hai woh agar target se chota, toh uske left mein saare
                 * elements chote honge, toh searching start hi mid ke ek aage se karo(i.e. low
                 * = mid+1)
                 */
            } else {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent);
    }
}
