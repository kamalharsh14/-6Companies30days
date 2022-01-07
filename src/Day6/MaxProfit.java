//Problem Link: https://practice.geeksforgeeks.org/problems/maximum-profit4657/1

package Day6;
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
        int max = 0;
        
        return max;
    }
}
