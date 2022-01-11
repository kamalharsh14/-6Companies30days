//Problem Link: https://practice.geeksforgeeks.org/problems/count-ways-to-nth-stairorder-does-not-matter1322/1/

package Day8;
import java.util.*;
public class CountWaysToNStairs {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(countWays(in.nextInt()));
        in.close();
    }
    public static Long countWays(int n) {
        return (n/2L)+1;
    }
}