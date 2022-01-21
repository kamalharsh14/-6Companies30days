//Problem Link: https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1/

package Day19;

import java.util.*;

public class Elections {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String arr[] = new String[n];
        System.out.println(winner(arr, n));
        in.close();
    }
    public static String[] winner(String arr[], int n)
    {
       HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        String winner = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            if (val > max) {
                max = val;
                winner = key;
            } else if (val == max && winner.compareTo(key) > 0) {
                winner = key;
            }
        }
        String[] st = {winner, Integer.toString(max)};
        return st;
    }
}