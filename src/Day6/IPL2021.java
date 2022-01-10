//Problem Link:

package Day6;
import java.util.*;
public class IPL2021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        IPL2021 ob = new IPL2021();
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        ArrayList<Integer> stats = new ArrayList<>();
        stats = ob.max_of_subarrays(arr, n , k);
        System.out.println(stats);
    }

    public ArrayList<Integer> max_of_subarrays(int [] arr, int n, int k){
        if(n == 0)
        return null;
        else{
            ArrayList<Integer> res = new ArrayList<>();
            for(int i = 0 ; i < n - k + 1; i ++){
                int max = arr[i];
                for(int j = i ; j < k+i ; j ++){
                    if(arr[j] > max){
                        max = arr[j];
                    }
                }
                res.add(max);
            }
            return res;
        }
    }
}
