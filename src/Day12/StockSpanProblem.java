//Problem Link: https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

package Day12;
import java.util.*;
public class StockSpanProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int price[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            price[i] = in.nextInt();
        }
        int span[] = calculateSpan(price, n);
        for(int i = 0 ; i < n ; i ++){
            System.out.print(span[i]+" ");
        }
        in.close();
    }

    public static int[] calculateSpan(int price[], int n){
        int span[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 0 ; i < n ; i ++){
            while(!st.isEmpty() && price[st.peek()] <= price[i]){
                st.pop();
            }
            if(st.empty()){
                span[i] = i+1;
            }
            else{
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
}