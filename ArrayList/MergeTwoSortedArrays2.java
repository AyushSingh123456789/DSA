import java.util.Vector;

public class MergeTwoSortedArrays2 {
    static void merge(Vector<Integer> ans, Vector<Integer> vec1, Vector<Integer> vec2) {

        int i = 0;
        int j = 0;
        while (i < vec1.size() && j < vec2.size()) {
            if (vec1.get(i) < vec2.get(j)) {
                ans.add(vec1.get(i));
                i++;
            } else {
                ans.add(vec2.get(j));
                j++;
            }
        }
        while (i < vec1.size()) {
            ans.add(vec1.get(i));
            i++;
        }
        while (j < vec2.size()) {
            ans.add(vec2.get(j));
            j++;
        }

        System.out.println("Final ArrayList: " + ans);
    }

    public static void main(String[] args) {
        Vector<Integer> vec1 = new Vector<>();
        vec1.add(2);
        vec1.add(3);
        vec1.add(4);
        vec1.add(5);
        Vector<Integer> vec2 = new Vector<>();
        vec2.add(6);
        vec2.add(7);
        vec2.add(8);
        Vector<Integer> ans = new Vector<>();

        System.out.println("Initial ArrayList: " + ans);
        merge(ans, vec1, vec2);
    }
}
