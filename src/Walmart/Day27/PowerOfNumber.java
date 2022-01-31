//Problem Link: https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1/?company[]=Walmart&company[]=Walmart&page=1&query=company[]Walmartpage1company[]Walmartpackage Walmart.Day27;

package Walmart.Day27;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r = sc.nextInt();
        long ans = power(n, r);
        System.out.println(ans);
        sc.close();
    }

    private static long power(int N, int R) {
        return computePowerRecursive(N, R) % 1000000007;

    }

    private static long computePowerRecursive(int N, int R) {
        if (R == 0)
            return 1;

        long result = power(N, R / 2);
        result = (result * result) % 1000000007;
        if (R % 2 == 0)
            return result;
        else
            return result * N;
    }
}
