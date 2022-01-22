//Problem Link: https://practice.geeksforgeeks.org/problems/minimum-number-of-steps-to-reach-a-given-number5234/1/

package Microsoft.Day15;
import java.util.*;
public class MinimumStepstoDestination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();
        System.out.println(minSteps(D));
        in.close();
    }

    public static int minSteps(int D) {
        D = Math.abs(D);
        int s = 0;
        int i = 1;
        while (s < D || (s - D) % 2 != 0) s += i++;
        return i - 1;
    }
}
