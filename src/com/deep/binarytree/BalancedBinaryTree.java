package com.deep.binarytree;

import com.deep.binarytree.TreeMaxDepth.TreeNode;

public class BalancedBinaryTree {

	    int depth=0;
	    public boolean isBalanced(TreeNode root) {
	        int difference=0;
	        if(root==null) return true;
	        
	        int left = dfs(root.left);
	        int right = dfs(root.right);
	            difference = left-right;
	        if(difference > 1){
	            return false;
	        }
	        return true;
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
