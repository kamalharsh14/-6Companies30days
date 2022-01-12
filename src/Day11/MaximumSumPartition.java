//Problem Link: 


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
        
	    return dp[n][n];
	} 
}