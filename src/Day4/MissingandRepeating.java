//Problem Link: https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1/

package Day4;

import java.util.*;

public class MissingandRepeating{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i]  =in.nextInt();
        }
        int b[] = new int[n+1];

        for(int i = 1 ; i <= n ; i ++){
            b[i] = 0;
        }

        for(int i = 0 ; i < n ; i ++){
            b[arr[i]] = b[arr[i]] + 1;
        }
        int res[] = new int[n];
        for(int i = 1 ; i <= n; i ++){
            if(b[i] > 1){
                res[0] = i;
            }
            if(b[i] == 0){
                res[1] = i;
            }
        }

        System.out.println(res[0]+" "+res[1]);
        in.close();
    }
}