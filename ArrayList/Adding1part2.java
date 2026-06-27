import java.util.Collections;
import java.util.Vector;

public class Adding1part2 {
    static void add(Vector<Integer> vec1) {
        int carry = 1;
        for (int i = vec1.size() - 1; i >= 0; i--) {
            if (carry + vec1.get(i) <= 9) {
                vec1.set(i, carry + vec1.get(i));
                carry = 0;
            } else {
                vec1.set(i, 0);
                carry = 1;
            }
        }
        if (carry == 1) {
            vec1.add(carry);
        }
        // Collections.reverse(vec1); -> changed the iteration start from RHS
        System.out.println("Final Vector: " + vec1);
    }

    public static void main(String[] args) {
        Vector<Integer> vec1 = new Vector<>();
        vec1.add(1);
        vec1.add(1);
        vec1.add(0);
        vec1.add(1);
        vec1.add(0);
        vec1.add(0);
        vec1.add(0);
        vec1.add(1);
        vec1.add(0);
        vec1.add(1);

        System.out.println("Initial Vector: " + vec1);

        add(vec1);
    }
}
