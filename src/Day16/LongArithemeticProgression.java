//Problem Link:  https://practice.geeksforgeeks.org/problems/longest-arithmetic-progression1019/1/

package Day16;
import java.util.*;
public class LongArithemeticProgression {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println(lengthOfLongestAP(arr, n));
        in.close();
    }

    static int lengthOfLongestAP(int[] arr, int n) {
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        if(n <= 2){
            return n;
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                int diff = arr[i] - arr[j];
                dp[i].put(diff, dp[j].getOrDefault(diff, 1) + 1);
                ans = Math.max(ans, dp[i].get(diff));
            }
        }
        return ans;
    }
}
