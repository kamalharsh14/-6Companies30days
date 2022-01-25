//Problem Link: https://practice.geeksforgeeks.org/problems/largest-number-in-k-swaps-1587115620/1

package Intuit.Day22;
import java.util.*;
public class LargestNumberinKSwaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();
        System.out.println(findMaximumNum(str, k));
        in.close();
    }
    
    public static String findMaximumNum(String str, int k){
        findMaximumNum1(str, k);
        return max;
    }
    
    static String max = "0";
    public static void findMaximumNum1(String str, int k){
        if(k == 0){
            return;
        }

        if(Integer.parseInt(str) > Integer.parseInt(max)){
            max = str;
        }

        for(int i = 0 ; i < str.length() -1; i++){
            for(int j = i+1 ; j < str.length(); j++){
                if(str.charAt(i) < str.charAt(j)){
                    String swapped = swap(str, i, j);
                    findMaximumNum1(swapped, k-1);
                }
            }
        }
    }

    public static String swap(String str, int i , int j){
        char swapi = str.charAt(i);
        char swapj = str.charAt(j);

        String first = str.substring(0, i);
        String middle = str.substring(i+1, j);
        String last = str.substring(j+1, str.length());

        String swapped = first + swapj + middle + swapi + last;
        return swapped;
    }
}