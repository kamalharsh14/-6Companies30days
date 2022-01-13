//Problem Link: https://practice.geeksforgeeks.org/problems/prerequisite-tasks/1/

package Day11;
import java.util.*;
public class PrerequisiteTasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int pre[][] = new int[p][2];
        for(int i = 0 ; i < n ; i ++){
            pre[i][0] = in.nextInt();
            pre[i][1] = in.nextInt();
        }
        System.out.println(isPossible(n, pre));
        in.close();
    }
    public static boolean isPossible(int N, int[][] prerequisites)
    {
        boolean flag = true;
        return flag;
    }
}