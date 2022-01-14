//Problem Link: https://practice.geeksforgeeks.org/problems/deee0e8cf9910e7219f663c18d6d640ea0b87f87/1/

package Day6;
import java.util.*;
public class IPL2021Match {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        IPL2021Match ob = new IPL2021Match();
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        ArrayList<Integer> stats = new ArrayList<>();
        stats = ob.max_of_subarrays(arr, n , k);
        System.out.println(stats);
        in.close();
    }

    public ArrayList<Integer> max_of_subarrays(int[] arr, int n, int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int[] brr = new int[n];

        stack.push(arr.length - 1);
        brr[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (stack.size() > 0 && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.size() == 0) {
                brr[i] = arr.length;
            } else {
                brr[i] = stack.peek();
            }
            stack.push(i);
        }
        for (int i = 0; i <= arr.length - k; i++) {
            int j = i;
            while (brr[j] < i + k) {
                j = brr[j];
            }
            ans.add(arr[j]);
        }
        return ans;
    }
}
