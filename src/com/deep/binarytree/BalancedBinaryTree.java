package com.deep.binarytree;

import com.deep.binarytree.TreeMaxDepth.TreeNode;

public class BalancedBinaryTree {

	int depth=0;
    public boolean isBalanced(TreeNode root) {
        int difference=0;
        if(root==null) return true;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
            if(left>right){
                difference = Math.abs(left-right);
            }
        else{
            difference=Math.abs(right-left);
        }
        if(difference > 1){
            return false;
        }
        return true && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int dfs(TreeNode root){
       if(root==null) return 0;
       int left=dfs(root.left);
        int right=dfs(root.right);
        
        return Math.max(left,right)+1;
    }
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
