//Problem Link: https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1/

package Microsoft.Day12;
import java.util.*;

public class PossibleWordsfromPhoneDigits{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(possibleWords(arr,n));
        in.close();
    }

    String codes[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz","*","#"};

    public static ArrayList <String> possibleWords(int a[], int n)
    {
        ArrayList<String> ans = new ArrayList<>();
        if (n == 0)
            return ans;

        int index = 0;
        String output = "";
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(a, n, index, keypad, output, ans);
        return ans;
    }

    public static void solve(int[] a, int n, int index, String[] keypad, String output, ArrayList<String> ans) {
        if (index >= n) {
            ans.add(output);
            return;
        }

        String temp = keypad[a[index]];
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            solve(a, n, index + 1, keypad, output + ch, ans);
        }

    }
}