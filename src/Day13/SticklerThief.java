//Problem Link: https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1/

package Day13;
import java.util.Scanner;

public class SticklerThief {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }
        System.out.println(findMaxSum(ar, n));
        in.close();
    }

    public static int findMaxSum(int[] arr, int n) {
        int[] dp = new int[arr.length + 2];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 0; i < arr.length; i++) {
            dp[i + 2] = Math.max(arr[i] + dp[i], dp[i + 1]);
        }
        return dp[dp.length - 1];
    }
}
