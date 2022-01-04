//Problem Link: https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/#

package Day2;

import java.util.Scanner;

public class UglyNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        UglyNumbers ob = new UglyNumbers();
        int n = in.nextInt();
        System.out.println(ob.getNthUglyNo(n));
        in.close();
    }

    long getNthUglyNo(int n) {
        long dp[] = new long[n+1];
        int p2 = 1;
        int p3 = 1;
        int p5 = 1;

        dp[1] = 1;
        for(int i = 2 ; i <= n ; i++){
            int f2 = 2 * (int)dp[p2];
            int f3 = 3 * (int)dp[p3];
            int f5 = 5 * (int)dp[p5];


            int min = Math.min(Math.min(f2, f3), f5);

            if(min == f2){ p2++; }
            if(min == f3){ p3++; }
            if(min == f5){ p5++; }

            dp[i] = (long)min;
        }
        return dp[n];
    }
}