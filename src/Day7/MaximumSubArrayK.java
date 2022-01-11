//Problem Link: https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1

package Day7;

import java.util.*;

public class MaximumSubArrayK {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        ArrayList<Integer> ans = max_of_subarrays(arr, n, k);
        System.out.println(ans);
        in.close();
    }

    public static ArrayList<Integer> max_of_subarrays(int[] arr, int n, int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int[] brr = new int[n];

        st.push(arr.length - 1);
        brr[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                brr[i] = arr.length;
            } else {
                brr[i] = st.peek();
            }

            st.push(i);
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