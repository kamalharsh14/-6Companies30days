//Problem Link: https://leetcode.com/problems/greatest-common-divisor-of-strings/submissions/
package GoldmanSachs.Day2;

import java.util.*;
public class GreatestCommonDivisorString{
    public static void main(String[] args) {
        GreatestCommonDivisorString ob = new GreatestCommonDivisorString();
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(ob.gcdOfStrings(str1, str2));
        in.close();
    }

    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        else if (str1.startsWith(str2) == false) {
            return "";
        }
 
        else if (str2.isEmpty()) {
            return str1;
        }
        else {
            return gcdOfStrings(str1.substring(str2.length()),
                       str2);
        }
    }
}
