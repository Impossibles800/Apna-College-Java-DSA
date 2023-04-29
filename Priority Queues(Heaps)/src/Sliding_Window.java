import java.util.PriorityQueue;

public class Sliding_Window {
    static class Pair implements Comparable<Pair> {

        int val;
        int idx;

        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val;
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int res[] = new int[a.length - k + 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(new Pair(a[i], i));
        }
        res[0] = pq.peek().val;

        for (int i = k; i < a.length; i++) {
            while (pq.size() > 0 && pq.peek().idx <= (i - k))
                pq.remove();
            pq.add(new Pair(a[i], i));
            res[i - k + 1] = pq.peek().val;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
