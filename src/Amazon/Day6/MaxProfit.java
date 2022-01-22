//Problem Link: https://practice.geeksforgeeks.org/problems/maximum-profit4657/1

package Amazon.Day6;
import java.util.*;
public class MaxProfit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }
        MaxProfit ob = new MaxProfit();
        System.out.println(ob.maxProfit(a, k));
        in.close();
    }

    public int maxProfit(int a[], int k){
        int n  = a.length;
        int dp[][] = new int[k+1][n];

        for(int i = 1 ; i <= k ; i ++){
            int max = Integer.MIN_VALUE;

            for(int d = 1 ; d < n ; d ++){
                if((dp[i-1][d-1] - a[d-1]) > max){
                    max = dp[i-1][d-1] - a[d-1];
                }
                if( max + a[d] > dp[i][d-1]){
                    dp[i][d] = max + a[d];
                }
                else{
                    dp[i][d] = dp[i][d-1];
                }
            }
        }
        
        return dp[k][n-1];
    }
}
