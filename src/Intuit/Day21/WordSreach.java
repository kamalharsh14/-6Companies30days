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
    public static boolean isWordExist(char[][] board, String word){char[] w = word.toCharArray();
        for (int y=0; y<board.length; y++) {
            for (int x=0; x<board[y].length; x++) {
                if (exist(board, y, x, w, 0)) return true;
            }
        }
        return false;
    }
    
    private static boolean exist(char[][] board, int y, int x, char[] word, int i) {
        if (i == word.length) return true;
        if (y<0 || x<0 || y == board.length || x == board[y].length) return false;
        if (board[y][x] != word[i]) return false;
        board[y][x] ^= 256;
        boolean exist = exist(board, y, x+1, word, i+1)
                || exist(board, y, x-1, word, i+1)
                || exist(board, y+1, x, word, i+1)
                || exist(board, y-1, x, word, i+1);
        board[y][x] ^= 256;
        return exist;
    }
}