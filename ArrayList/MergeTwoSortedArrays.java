// VVI **

/*  int[] arr1 = {2,5,6,9};
    int[] arr2 = {1,3,4,5,7,8};
    int[] ans = {1,2,3,4,5,5,7,8,9};
 */

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        /* Using 3 pointer Technique */

        int[] arr1 = { 2, 5, 6, 9 };
        int[] arr2 = { 1, 3, 4, 5, 7, 8 };

        int[] ans = new int[arr1.length + arr2.length];
        for (int ele1 : ans) {
            System.out.print(ele1 + " ");
        }
        System.out.println();

        merge(ans, arr1, arr2);

        for (int ele2 : ans) {
            System.out.print(ele2 + " ");
        }
    }

    public static void merge(int[] ans, int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
                // The post increment operator ensures the assignment of ans[k] = arr1[i] first,
                // then ++.
            } else {
                ans[k++] = arr2[j++];
                // The post increment operator ensures the assignment of ans[k] = arr2[j] first,
                // then ++.
            }
            /*
             * k++ => can also write it here, as both if-else conditions have this in
             * common, or we can use (++ postincrement operator).
             */
        }

        // Some unnecessary(cause while loop is enough)logic which can help with
        // understanding-:

        // if(i == arr1.length) // arr1 khatam -> arr2 ke bacche elements lijiye.
        // {
        // while(j < arr2.length)
        // {
        // ans[k++] = arr2[j++];
        // }
        // }
        // else // arr2 khatam -> arr1 ke bacche elements lijiye.
        // {
        // while(i < arr1.length)
        // {
        // ans[k++] = arr1[i++];
        // }
        // }
    }
}
