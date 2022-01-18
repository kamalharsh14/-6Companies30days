//Problem Link: https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

package Day16;
import java.util.*;
public class SubarraywithGivenSum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println(subarraySum(arr, n, s));
        in.close();
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int sum =arr[0], start = 0;
        for(int i = 1 ; i <= n ; i ++){

            while(sum > s && start < i-1){
                sum = sum - arr[start];
                start++;
            }

            if(sum == s){
                list.add(start+1);
                list.add(i);
                return list;
            }
            else if(i < n){
                sum = sum + arr[i];
            }

        }
        list.add(-1);
        return list;
    }
}
