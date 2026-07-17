public class singleAmongDoubleApp2 {
    static int sing(int[] arr) {
        if (arr.length == 1)
            return arr[0];
        if (arr[0] != arr[1])
            return arr[0];
        if (arr[arr.length - 1] != arr[arr.length - 2])
            return arr[arr.length - 1];
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])
                return arr[mid];
            int f = mid;
            int s = mid;
            if (arr[mid - 1] == arr[mid])
                f = mid - 1;
            else
                s = mid + 1; // arr[mid] == arr[mid+1]

            int leftCount = f - left;
            int rightCount = right - s;

            if (leftCount % 2 == 0)
                left = s + 1;
            else
                right = f - 1;
        }
        return 1; // just for the sake of representation of an integer return value.
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3 };
        int n = arr.length;
        int result = sing(arr);
        System.out.println(result);
    }
}
