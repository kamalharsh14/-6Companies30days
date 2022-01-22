//Problem Link: https://practice.geeksforgeeks.org/problems/run-length-encoding/1/

package GoldmanSachs.Day2;

import java.util.Scanner;

public class RunLengthEncoding{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
          String str = in.nextLine();
          int n = str.length();
          String res = "";
          int count = 1;
          int i = 0;
          for(i = 1 ; i < n ; i ++){
              if(str.charAt(i) == str.charAt(i-1)){
                  count++;
                }
              else{
                res = res + str.charAt(i-1) + Integer.toString(count);
                count = 1;
              }
          }
          res = res + str.charAt(i-1) + Integer.toString(count);
          System.out.println(res);
        }
    }
}