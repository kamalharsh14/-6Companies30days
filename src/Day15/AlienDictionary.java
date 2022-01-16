//Problem Link: https://practice.geeksforgeeks.org/problems/alien-dictionary/1/

package Day15;
import java.util.*;;
public class AlienDictionary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        String[] dict = new String[n];
        for (int i = 0; i < n; i++){
            dict[i] = in.next();
        }
        System.out.println(findOrder(dict, n, k));
        in.close();
    }

    public static String findOrder(String[] dict, int n, int K) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            adj.add(i, new ArrayList<>());
        }

        for (int i = 0; i < dict.length - 1; i++) {
            for (int j = 0; j < Math.min(dict[i].length(), dict[i + 1].length()); j++) {
                if (dict[i].charAt(j) != dict[i + 1].charAt(j)) {
                    adj.get(dict[i].charAt(j) - 'a').add(dict[i + 1].charAt(j) - 'a');
                    break;
                }

            }
        }
        String str = topologicalSort(adj, K);


        return str;
    }

    public static String topologicalSort(ArrayList<ArrayList<Integer>> adj, int n) {
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[n];


        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfsCheck(adj, i, st, vis);
            }
        }

        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            char c = (char) (st.pop() + 'a');
            str.append(c);
        }

        return str.toString();
    }

    public static void dfsCheck(ArrayList<ArrayList<Integer>> adj, int i, Stack<Integer> st, boolean[] vis) {
        vis[i] = true;

        for (int it : adj.get(i)) {
            if (!vis[it]) {
                dfsCheck(adj, it, st, vis);
            }
        }

        st.push(i);
    }
}