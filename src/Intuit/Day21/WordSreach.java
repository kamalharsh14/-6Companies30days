//Problem Link: https://practice.geeksforgeeks.org/problems/word-search/1/

package Intuit.Day21;
import java.util.*;
public class WordSreach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char board[][] = new char[n][m];

        for(int i = 0 ; i < n ; i ++)
            for(int j = 0; j < m ; j ++)
                board[i][j] = in.next().charAt(0);
        
        String word = in.next();
        System.out.println(isWordExist(board, word));
        in.close();
    }
    static boolean isWordExist(char[][] grid,String word){
        boolean flag = false;
        return flag;
    }
}