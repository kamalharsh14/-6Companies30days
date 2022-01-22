//Problem link: https://practice.geeksforgeeks.org/problems/count-number-of-subtrees-having-given-sum/1/

package Microsoft.Day15;

public class SubtreesHavingGivenSum {

    static int count = 0;

    int countSubtreesWithSumX(Node root, int X) {
        count = 0;
        solve(root, X);
        return count;
    }

    static int solve(Node root, int X) {
        if (root == null) return 0;

        int l = solve(root.left, X);
        int r = solve(root.right, X);
        int sum = root.data + l + r;
        if (sum == X)
            count++;
        return sum;

    }

}

class Node
{
        int data;
        Node left,right;
        Node(int d)
        {
        data=d;
        left=right=null;
        }
        }
