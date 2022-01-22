//Problem Link: https://practice.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1/

package Microsoft.Day13;
import java.util.*;
public class UnitArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int grid[][] = new int[n][n];
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ; j ++){
                grid[i][j] = in.nextInt();
            }
        }
        System.out.println(findMaxArea(grid));
        in.close();
    }

    public static int findMaxArea(int[][] grid)
    {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int num = search(i, j, grid);
                    result = Math.max(result, num);
                }
            }
        }
        return result;
    }

    public static int search(int i, int j, int[][] grid) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
            return 0;

        grid[i][j] = 0;
        int sum = 0;
        sum += search(i + 1, j, grid);
        sum += search(i, j + 1, grid);
        sum += search(i, j - 1, grid);
        sum += search(i - 1, j, grid);

        sum += search(i + 1, j + 1, grid);
        sum += search(i - 1, j - 1, grid);
        sum += search(i + 1, j - 1, grid);
        sum += search(i - 1, j + 1, grid);
        return sum + 1;

    }
}
