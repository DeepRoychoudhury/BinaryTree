package com.deep.binarytree;

import java.util.ArrayList;
import java.util.List;

import com.deep.binarytree.TreeMaxDepth.TreeNode;

public class UnivalBinaryTree {

    List<Integer> treevalues = new ArrayList<Integer>();
    public boolean isUnivalTree(TreeNode root) { 
        dfs(root);
       for(int i : treevalues){
           if(root.val!=i) return false; 
       }
        return true;
    }
    
    public void dfs(TreeNode root){
        if(root!=null){
            treevalues.add(root.val);
            dfs(root.left);
            dfs(root.right);
        }
    }
	
	public static void main(String[] args) {

	}

}
