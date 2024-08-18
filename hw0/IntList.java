public class IntList {
    public int first;
    public IntList rest;

    public IntList (int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the IntList using recursive method.*/
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + rest.size();
    }

    /** Return the size of the IntList using the iterative method.*/
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /** Return the i-th element of this IntList using recursive method. */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    /** Return the i-th element of this IntList using iterative method. */
    public int iterativeGet(int i) {
        IntList p = this;
        while (i > 0) {
            p = p.rest;
            i -= 1;
        }
        return p.first;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L = new IntList(10, L);
        L = new IntList(15, L);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(0));
        System.out.println(L.iterativeGet(0));
    }
}
