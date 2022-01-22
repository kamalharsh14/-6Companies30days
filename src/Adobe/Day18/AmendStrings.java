//Problem Link: https://practice.geeksforgeeks.org/problems/amend-the-sentence3235/1#

package Adobe.Day18;

import java.util.Scanner;

public class AmendStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(amendSentence(s));
        in.close();
    }
    
    public static String amendSentence(String s){
        String ans = "";
        for(int i = 0 ; i < s.length(); i ++){
            if(Character.isUpperCase(s.charAt(i)) && i != 0){
                ans = ans + " "+ Character.toLowerCase(s.charAt(i));
            }
            else{
                ans = ans + Character.toLowerCase(s.charAt(i));
            }
        }
        return ans;
    }
}