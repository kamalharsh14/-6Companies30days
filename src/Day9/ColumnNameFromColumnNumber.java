//Problem Link: https://practice.geeksforgeeks.org/problems/column-name-from-a-given-column-number4244/1/

package Day9;

import java.util.Scanner;

public class ColumnNameFromColumnNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long input=in.nextLong();
        String ans=colName(input);
        System.out.println(ans);
        in.close();
    }

    public static String colName(long n) {
        StringBuilder ans=new StringBuilder();
        while(n>0){
            char ch= (char) ('A'+(n-1)%26);
            ans.append(ch);
            n=(n-1)/26;
        }
        return ans.reverse().toString();

    }
}
