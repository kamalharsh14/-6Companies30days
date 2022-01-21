//Problem Link: https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1

package Day17;
import java.util.*;
public class EqualSumPartition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(equalPartition(n, arr));
        in.close();
    }
    static int equalPartition(int n, int arr[])
    {
        int sum = 0;
        for(int i = 0 ; i < n ; i ++){
            sum = sum + arr[i];
        }

        if(sum % 2 == 0){
            boolean dp[][]=  new boolean[n+1][sum+1];

            for(int i = 0 ; i <= n ; i ++){
                for(int j = 0 ; j <= sum ; j ++){
                    if(i == 0 || j == 0){
                        dp[i][j] = false;
                    }
                    else if(arr[i-1] > j){
                        dp[i][j] = dp[i-1][j];
                    }
                    else if(arr[i-1] == j){
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                    }
                }
            }
            if(true == dp[n][sum/2]){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
    }
}
