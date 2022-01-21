//Problem Link: https://practice.geeksforgeeks.org/problems/express-as-sum-of-power-of-natural-numbers5647/1

package Day17;

import java.util.Scanner;

public class SumofPowerofNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        System.out.println(numOfWays(n, x));
        in.close();
    }

    static int numOfWays(int n, int x)
    {
        return getAllWaysHelper(n,x,1);
    }

    static int getAllWaysHelper(int remainingSum, int power, int base){
      int result = (int)Math.pow(base, power);
         
      if(remainingSum == result)
          return 1;
      if(remainingSum < result)
          return 0;
      int x = getAllWaysHelper(remainingSum - result, power, base + 1);
      int y = getAllWaysHelper(remainingSum, power, base+1);
      return x + y;
  }
}