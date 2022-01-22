//Problem Link: https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1

package Amazon.Day8;

import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.next();
        String ans=FirstNonRepeating(s);
        System.out.println(ans);
        in.close();
    }

    public static String FirstNonRepeating(String A) {
        StringBuilder ans = new StringBuilder();
        int isRepeated[] = new int[26];
        Deque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (isRepeated[ch - 'a'] == 0)
                queue.add(ch);

            isRepeated[ch - 'a']++;
            while (!queue.isEmpty() && isRepeated[queue.peek() - 'a'] != 1)
                queue.poll();
            ans.append(queue.isEmpty() ? '#' : queue.peek());
        }
        return  ans.toString();
    }
}
