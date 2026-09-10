/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int totalcount=0;
    private class SubTree{
        int sum; int count;
        SubTree(int count, int sum){
            this.count=count;
            this.sum= sum;
        }
    }
    private SubTree postorder(TreeNode root){
 if(root==null)return new SubTree(0,0);
     SubTree left= postorder(root.left);
     SubTree right= postorder(root.right);
 int currsum= root.val+left.sum+right.sum;
 int currcount= 1+left.count+right.count;
 if((currsum/currcount)==root.val) totalcount++;
 return new SubTree(currcount,currsum);
    }
    public int averageOfSubtree(TreeNode root) {
     postorder(root);
     return totalcount;   
    }
}