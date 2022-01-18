//Problem Link:  https://practice.geeksforgeeks.org/problems/longest-arithmetic-progression1019/1/

package Day16;
import java.util.*;
public class LongArithemeticProgression {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println(lengthOfLongestAP(arr, n));
        in.close();
    }

    static int lengthOfLongestAP(int[] arr, int n) {
        int max = 1;
        for(int i = 1 ; i < n; i ++){
            int d = arr[i] - arr[i-1];
            int ap = arr[i-1] + (i)* d;
            int c = 0;
            int count = 1;
            while(c < n){
                if(ap == arr[c++]){
                    count++;
                }
            }
            if(max < count){
                max = count;
            }
        }
        return max;
    }
}
