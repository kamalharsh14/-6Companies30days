//Problem Link: https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1/#

package Day19;
import java.util.*;
public class LeaderInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println(leaders(arr, n));
    }

    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == -1) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}