//Problem Link: https://www.google.com/url?q=https://practice.geeksforgeeks.org/problems/is-sudoku-valid4820/1/&sa=D&source=docs&ust=1641920068576064&usg=AOvVaw21Cz2o-O3D-U_pa0gnekDR

package Day8;
import java.util.*;

public class IsSudokuValid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        int ans = isValid(mat);
        System.out.println(ans);
        in.close();
    }

    private static int isValid(int[][] mat) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int val = mat[i][j];
                if (val != 0) {
                    if (!set.add(val + "found in row " + i) || !set.add(val + "found in column " + j) || !set.add(val + "found in sub box " + i / 3 + "-" + j / 3))
                        return 0;
                }
            }
        }

        return 1;
    }
}
