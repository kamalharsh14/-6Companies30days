//Problem Link: https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/#

package Day2;

import java.util.Scanner;

public class UglyNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        UglyNumbers ob = new UglyNumbers();
        int n = in.nextInt();
        long num = ob.getNthUglyNo(n);
        System.out.println(num);
        in.close();
    }

    long getNthUglyNo(int n) {
        long res = 0;
        return res;
    }
}
