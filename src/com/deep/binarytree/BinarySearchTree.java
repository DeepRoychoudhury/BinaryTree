//Implementing binary search tree

package com.deep.binarytree;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;	
}

class BST{
	
	public TreeNode insert(TreeNode node, int val){
		if(node==null){
			return createNewNode(val);
		}
		if(val<node.data){
			node.left=insert(node.left,val);
		}
		else if(val>node.data){
			node.right=insert(node.right,val);
		}
		return node;
	}

	private TreeNode createNewNode(int val) {
		TreeNode node = new TreeNode();
		node.data=val;
		node.left=null;
		node.right=null;
		return node;
	}
	
}

public class BinarySearchTree{
	public static void main(String[] args){
		BST bst = new BST();
		TreeNode root = null;
		
		//Add values to binary tree {8,3,6,10,4,7,1,14,13}		
		root=bst.insert(root, 8);
		root=bst.insert(root, 3);
		root=bst.insert(root, 6);
		root=bst.insert(root, 10);
		root=bst.insert(root, 4);
		root=bst.insert(root, 7);
		root=bst.insert(root, 1);
		root=bst.insert(root, 14);
		root=bst.insert(root, 13);
		System.out.println(root);
	}
}
