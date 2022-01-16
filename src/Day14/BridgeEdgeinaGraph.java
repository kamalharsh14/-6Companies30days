//Problem Link: https://practice.geeksforgeeks.org/problems/bridge-edge-in-graph/1

package Day14;
import java.util.*;
public class BridgeEdgeinaGraph {
    
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj, int c, int d) {
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.offer(c);

        vis[c] = true;

        adj.get(c).remove(Integer.valueOf(d));
        adj.get(d).remove(Integer.valueOf(c));

        while (!q.isEmpty()) {
            int it = q.poll();
            for (Integer v : adj.get(it)) {
                if (!vis[v]) {
                    q.offer(v);
                    vis[v] = true;
                }
            }
        }
        
        if (vis[d])
            return 0;
        return 1;
    }
}
