//Problem Link: https://practice.geeksforgeeks.org/problems/decode-the-string2444/1

package Day5;
import java.util.*;
public class DecodetheString {
    public static void main(String[] args) {
        Scanner in=  new Scanner(System.in);
        String str = in.nextLine();
        DecodetheString ob = new DecodetheString();
        System.out.println(ob.decode(str));
        in.close();
    }

    String decode(String str){
        int n = str.length();
        String res = "";
        Stack<Character> st = new Stack<>();
        Stack<Character> num = new Stack<>();
        for(int i = 0 ; i < n ; i ++){
            char ch = str.charAt(i);
            
        }
        return res;
    }
}
