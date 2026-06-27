import java.util.Arrays;

public class Segregate0s1s2s {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 2, 1, 0, 1, 0, 2 };
        int n = arr.length;

        int Zc = 0;
        int Oc = 0;
        int Tc = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                Zc += 1;
            } else if (arr[i] == 1) {
                Oc += 1;
            } else {
                Tc += 1;
            }
        }

        for (int p = 0; p < Zc; p++) {
            arr[p] = 0;
        }
        for (int q = Zc; q < Zc + Oc; q++) {
            arr[q] = 1;
        }
        for (int r = Zc + Oc; r < Zc + Oc + Tc; r++) {
            arr[r] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
