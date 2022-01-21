package Day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(AllParenthesis(n));
        in.close();
    }
    public static List<String> AllParenthesis(int n) {

        List<String> ans=new ArrayList<>();
        solve(n,n,ans,"");

        return ans;
    }

    public static void solve(int a, int b, List<String> ans, String t) {
        if(a==0 && b==0)
        {
            ans.add(t);
            return;
        }

        if(a<b)
        {
            if(a>=0)
                solve(a-1,b,ans,t+'(');
            if(b>=0)
                solve(a,b-1,ans,t+')');
        }
        else if(a==b)
        {   if(a>=0)
            solve(a-1,b,ans,t+'(');
        }
        else {
            return;
        }
    }
}