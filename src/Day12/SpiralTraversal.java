//Problem Link: https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1/

package Day12;
import java.util.*;
public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(spirallyTraverse(arr, n, m));
        in.close();
    }

    public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, bottom = r-1, left = 0, right = c-1;
        int dir = 0;
        while(top <= bottom && left <= right){
            if(dir == 0){
                for(int i = left ; i <= right; i++){
                    list.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir == 1){
                for(int i = top; i <= bottom; i ++){
                    list.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir == 2){
                for(int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if(dir == 3){
                for(int i = bottom; i >= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
            dir = (dir+1) % 4;
        }
        return list;
    }
}