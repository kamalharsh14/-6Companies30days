//Problem Link: https://leetcode.com/problems/longest-mountain-in-array/

package Amazon.Day6;
import java.util.*;
public class LongestMountain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }
        LongestMountain ob = new LongestMountain();
        System.out.println(ob.longestMountain(arr));
        in.close();
    }

    int longestMountain(int[] arr){
        int n = arr.length;
        int ans = 0;
        for(int i = 1 ; i <= n-2 ;){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                int j = i;
                int count = 1;
                while(j > 0 && arr[j] > arr[j-1]){
                    j--;
                    count++;
                }
                while(i < n-1 && arr[i] > arr[i+1]){
                    i++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
            else{
                i++;
            }
        }
        return ans;
    }
}