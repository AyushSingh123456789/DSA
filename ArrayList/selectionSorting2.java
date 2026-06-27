import java.util.Vector;

public class selectionSorting2 {
    static void sS(Vector<Integer> v1) {
        System.out.println(v1);
    }

    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(2);
        v1.add(-4);
        v1.add(5);
        v1.add(1);
        v1.add(0);
        v1.add(8);
        int n = v1.size();

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = 0;
            for (int j = i; j < n; j++) {
                if (v1.elementAt(j) < min) {
                    min = v1.elementAt(j);
                    mindx = j;
                }
            }
            int temp = v1.elementAt(i);
            v1.set(i, min);
            v1.set(mindx, temp);
        }
        sS(v1);
    }
}
