//Problem Link: https://practice.geeksforgeeks.org/problems/rotate-by-90-degree0356/1/

package Day11;
import java.util.*;
public class RotateMatrixby90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                arr[i][j] = in.nextInt();
            }
        }
        rotate(arr);
        System.out.println();
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }

    public static int[][] rotate(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;

        //Transpose matrix
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < i ; j ++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //swaping rows
        for(int i = 0 ; i < n/2 ; i ++){
            for(int j = 0 ; j < m ; j ++){
                int temp = arr[i][j];
                arr[i][j] = arr[n - i - 1][j];
                arr[n - i - 1][j] = temp;
            }
        }
        return arr;
    }
}
