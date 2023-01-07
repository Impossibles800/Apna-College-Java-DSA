import java.util.ArrayList;
import java.util.Arrays;

public class Detect_cycle extends Graph {
    public static boolean detect_cycle(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i] && helper(graph, visited, i, -1))
                return true;
        }
        return false;
    }

    public static boolean helper(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent) {
        visited[curr] = true;
        for (int i = 0; i < graph.length; i++) {
            Edge e = graph[curr].get(i);
//            case1 :
            if (visited[e.dest] && e.dest != parent)
                return true;
//          case 2 :
            else if (!visited[e.dest])
                if (helper(graph, visited, e.dest, curr))
                    return true;
//            case 3:
            continue;
        }
        return false;
    }

}
