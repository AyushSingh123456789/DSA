import java.util.Vector;

public class zeroesToRight {
    static void zeroestoRight(Vector<Integer> v1, int[] arr) {
        int m = v1.size();
        for (int x = 0; x < m; x++) {
            arr[x] = v1.elementAt(x);
        }
        for (int ele2 : arr) {
            System.out.print(ele2 + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 0, 5, 0, -2, 0, -5 };
        int n = arr.length;
        Vector<Integer> v1 = new Vector<>();
        for (int ele : arr) {
            v1.add(ele);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (v1.elementAt(j) == 0) {
                    int temp = v1.elementAt(j);
                    v1.set(j, v1.elementAt(j + 1));
                    v1.set(j + 1, temp);
                }
            }
        }
        zeroestoRight(v1, arr);
    }
}
