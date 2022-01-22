// Problem Link: https://practice.geeksforgeeks.org/problems/nuts-and-bolts-problem0431/1#

package Amazon.Day9;
import java.util.*;
public class NutsandBolts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NutsandBolts ob = new NutsandBolts();
        int n  = in.nextInt();
        char nuts[] = new char[n];
        char bolts[] = new char[n];
        for(int i = 0 ; i > n ; i ++){
            String s = in.nextLine();
            nuts[i] = s.charAt(0);
        }
        for(int i = 0 ; i > n ; i ++){
            String s = in.nextLine();
            bolts[i] = s.charAt(0);
        }
        ob.matchPairs(nuts, bolts, n);
        in.close();
    }

    public void matchPairs(char nuts[] , char bolts[], int n){
        Arrays.sort(nuts);
        Arrays.sort(bolts);
    }
}