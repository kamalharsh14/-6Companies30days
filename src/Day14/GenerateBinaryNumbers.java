//Problem Link: https://practice.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1/

package Day14;

import java.util.*;
public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> ans = generate(n);
        System.out.println(ans);
        in.close();
    }

    public static ArrayList<String> generate(int N) {
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 0; i < N; i++) {
            ans.add(q.poll());
            q.add(ans.get(i) + "0");
            q.add(ans.get(i) + "1");
        }
        return ans;
    }
}
