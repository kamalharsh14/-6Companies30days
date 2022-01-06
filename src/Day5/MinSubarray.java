//Problem Link: https://leetcode.com/problems/minimum-size-subarray-sum/submissions/

package Day5;
import java.util.*;
public class MinSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n ; i++){
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        if (a == null || a.length == 0)
        {
            System.out.println("0");
        }
        else{
            int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

            while (j < a.length) {
                sum += a[j++];

                while (sum >= k) {
                    min = Math.min(min, j - i);
                    sum -= a[i++];
                }
            }
            System.out.println(min == Integer.MAX_VALUE ? 0 : min);
        }        
        in.close();
    }
}
