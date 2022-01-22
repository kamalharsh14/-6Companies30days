//Problem Link: https://practice.geeksforgeeks.org/problems/total-decoding-messages1235/1/

package Day3;

import java.util.Scanner;

public class EncodingString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        EncodingString ob = new EncodingString();
        System.out.println("Number of Messages: "+ob.encoding(str));
        in.close();
    }
    int encoding(String str){
        int n = str.length();
        int dp[] = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n ; i++){
            char previous = str.charAt(i-1);
            char current = str.charAt(i);

            if(previous == '0' && current == '0'){
                dp[i] = 0;
            }
            else if(previous == '0' && current != '0'){
                dp[i] = dp[i-1];
            }
            else if(previous != '0' && current == '0'){
                if(previous == '1' || previous == '2'){
                    dp[i] = (i >= 2) ? dp[i-2] : 1;
                }
                else{
                    dp[i] = 0;
                }
            }
            else{
                if(Integer.parseInt(str.substring(i-1, i+1)) <= 26){
                    dp[i] = dp[i-1] + ((i >= 2) ? dp[i-2] : 1);
                }
                else{
                    dp[i] = dp[i-1];
                }
            }
        }
        return dp[n-1];
    }
}