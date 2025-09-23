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
    public boolean res(TreeNode first,TreeNode second)
    {
        if(first==null && second ==null)
        {
            return true;
        }
        if((first==null && second!=null) || (second==null && first!=null))
        {
            return false;
        }
        else if(first.val != second.val)
        {
            return false;
        }
        return res(first.left,second.right) && res(first.right,second.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        return res(root.left,root.right);

    }
}
