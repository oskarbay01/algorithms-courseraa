package union_find;
/*
 It's called Eager algorithm.
 Interpretation: p and q are connected iff (if and only if) they have the same id.

 */
public class QuickFind implements UnionFind {
    private final int[] id;

    public QuickFind(int size) {
        id = new int[size];

        for (int i = 0; i < size; i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid) id[i] = qid;
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }
}
