//Problem Link: https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1/
// package Walmart.Day27;
// class Solution{

//     public void toSumTree(Node root){
//         sumTree(root);
//     }

//     public int sumTree(Node root){
//         if(root==null) return 0;

//         int leftSum= sumTree(root.left);
//         int rightSum=sumTree(root.right);

//         int x=root.data;
//         int tsum=leftSum+rightSum;
//         root.data=tsum;
//         return tsum+x;
//     }
// }