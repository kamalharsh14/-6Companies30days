//Problem Link: https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1#

package Day3;

import java.util.Scanner;
import java.util.Stack;

public class NumberFollowingPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        NumberFollowingPattern ob = new NumberFollowingPattern();
        System.out.println("Number Folowing Pattern is: "+ob.pattern(str));;
        in.close();
    }

    String pattern(String str){
        int n = str.length();
        int c = 1;
        Stack<Integer> stack = new Stack<>();
        String num = "";
        for(int i = 0 ; i < n ;i++){
            if(str.charAt(i) == 'D'){
                stack.push(c);
                c++;
            }
            if(str.charAt(i) == 'I'){
                stack.push(c);
                c++;
                
                while(!stack.isEmpty()){
                    num = num + Integer.toString(stack.pop());
                }
            }
        }
        stack.push(c++);
        while(!stack.isEmpty()){
            num = num + Integer.toString(stack.pop());
        }
        return num;
    }
}