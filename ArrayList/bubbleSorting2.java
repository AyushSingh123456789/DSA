import java.util.Vector;

public class bubbleSorting2 {
    static void bS(Vector<Integer> v1) {
        System.out.println(v1);
    }

    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(2);
        v1.add(-3);
        v1.add(1);
        v1.add(4);
        v1.add(3);
        v1.add(0);
        int n = v1.size();

        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (v1.elementAt(j) > v1.elementAt(j + 1)) {
                    int temp = v1.elementAt(j);
                    v1.set(j, v1.elementAt(j + 1));
                    v1.set(j + 1, temp);
                    swaps++;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
        bS(v1);
    }
}
