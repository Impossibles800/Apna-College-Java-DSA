import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
    public static class Edge {
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void topological_sort(ArrayList<Edge>[]graph){
        int []inDegree = new int[graph.length];
        helper(graph,inDegree);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (inDegree[i]==0)
                q.add(i);
        }
//        bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.println(curr);
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;
                if (inDegree[e.dest]==0)
                    q.add(e.dest);
            }
        }
    }
    public static void helper(ArrayList<Edge>[]graph, int[] inDegree){
        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                inDegree[e.dest]++;
            }
        }
    }
}
