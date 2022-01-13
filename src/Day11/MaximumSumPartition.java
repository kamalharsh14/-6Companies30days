//Problem Link: https://practice.geeksforgeeks.org/problems/minimum-sum-partition3317/1/

package Day11;
import java.util.*;
public class MaximumSumPartition{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println(minDifference(arr, n));
        in.close();
    }

    public static int minDifference(int arr[], int n) 
	{ 
        int sum = 0;
        for(int i = 0 ; i < n ; i ++){
            sum = sum + arr[i];
        }
        
        boolean dp[][]=  new boolean[n+1][sum+1];

        for(int i = 0 ; i <= n ; i ++){
            for(int j = 0 ; j <= sum ; j ++){
                if(j == 0){
                    dp[i][j] = true;
                }
                else if(i == 0){
                    dp[i][j] = false;
                }
                else if(arr[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
            }
        }
        
        int diff = Integer.MAX_VALUE;
        
        for(int i = 0 ; i <= sum/2; i ++){
            int s1 = i;
            int s2 = sum - i;
            if(dp[n][i] == true && diff > Math.abs(s1 - s2)){
                diff = Math.abs(s1 - s2);
            }
        }
        return diff;
	} 
}