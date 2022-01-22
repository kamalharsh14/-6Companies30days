//Problem Link: https://practice.geeksforgeeks.org/problems/implement-atoi/1/

package Adobe.Day18;

import java.util.Scanner;

public class ATOI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(atoi(str));
        in.close();
    }

    static int atoi(String str) {
	    int length = str.length();
	    boolean flag = true;
	    for(int i = 0 ; i < length; i ++){
	        char ch = str.charAt(i);
	        if(!Character.isDigit(ch) && ch != '-'){
	            flag = false;
	        }
	        if(flag == false){
	            return -1;
	        }
	    }
	    return Integer.parseInt(str);
    }
}