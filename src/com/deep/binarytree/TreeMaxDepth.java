package com.deep.binarytree;

public class TreeMaxDepth {
	//Definition for a binary tree node.
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.val = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	        this.val = val;
	        this.left = left;
	        this.right = right;
	    }
	}
	
	public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) {return 1;}
        //implementation of DFS
        int leftdepth=maxDepth(root.left);
        int rightdepth=maxDepth(root.right);
        int depth = Math.max(leftdepth,rightdepth);
        return depth+1;
    }
	
	public static void main(String[] args) {
		//maxDepth(root);
		
	
	}

}
