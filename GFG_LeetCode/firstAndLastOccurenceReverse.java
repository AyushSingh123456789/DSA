public class firstAndLastOccurenceReverse {
    public static void main(String[] args) {

        // int[] arr = { 80, 60, 40, 4, 3, 3, 1 };
        int[] arr = { 50, 5, 5, 2, 1 };
        int target = 5;
        int idx1 = -1;
        int idx2 = -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            /*
             * AI gives: left + (right-left)/2 => prevents potential integer overflow(NOT
             * NECESSARY)
             */
            if (arr[mid] > target) {
                left = mid + 1;
            } else if (arr[mid] < target) {
                right = mid - 1;
            } else {
                idx1 = mid;
                right = mid - 1; // right is looking for the first occurence, while being >= left
            }
        }
        // Last Occurence:
        left = 0;
        right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) {
                left = mid + 1;
                right = arr.length - 1;
            } else if (arr[mid] < target) {
                right = mid - 1;
                left = 0;
            } else {
                idx2 = mid;
                left = mid + 1; // left is looking for the last occurence, while being <= right
            }
        }
        System.out.println("The resultant first and last index occurences are: " + idx1 + " , " + idx2);
    }
}
