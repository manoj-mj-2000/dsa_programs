//$Id$
package com.dsa;

import com.dsa.BinaryTree.Node;

public class BinarySearchTreeImpl {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(10); 
		
		bst.insert(12);
		bst.insert(8);
		bst.insert(6);
		bst.insert(4);
		bst.insert(2);
		bst.insert(14);
		bst.insert(16);
		bst.insert(18);
		
		System.out.println();
		BinarySearchTree.inOrderTraversal(bst.root);
		
		if(bst.search(bst.root, 2)== null) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found");
		}
		
		BinarySearchTree.delete(16);
		System.out.println();
		BinarySearchTree.inOrderTraversal(bst.root);
		
	}

}

class BinarySearchTree{
	Node root;
	class Node{
		int data;
		Node left, right;
		
		public Node(int n){
			data = n;
			left = null;
			right = null;
		}
	}
	
	public BinarySearchTree(int n){
		root = new Node(n);
	}
	public static Node delete(int val) {
		delete(root,val);
	}

	public static Node delete(Node root, int val) {
		
		if(root==null) {
			return null;
		}
		
		if(val > root.data) {
			root.right = delete(root.right, val);
		}
		else if (val < root.data) {
			root.left = delete(root.left, val);
		}
		else {
			if(root.right == null)
				return root.left;
			if(root.left == null)
				return root.right;
			
			root.data = minVal(root.right);
			root.right = delete(root.right, root.data);
		}
		
		return root;
	}

	private static int minVal(Node node) {
		int minVal = 0;
		
		while(node.left!=null) {
			minVal = node.left.data;
			node = node.left;
		}
		return minVal;
	}

	public Node search(Node root, int val) {
		
		if(root == null || root.data == val) {
			return root;
		}
		
		if(root.data > val) {
			return search(root.left, val);
		}
		else {
			return search(root.right, val);
		}
	}

	public void insert(int val) {
		insert(root, val);
	}

	public Node insert(Node root, int val) {
		
		if(root == null) {
			return new Node(val);
		}
		
		if(root.data > val) {
			root.left = insert(root.left, val);
		}
		else {
			root.right = insert(root.right, val);
		}
		
		return root;
	}
	
	
	public static void inOrderTraversal(Node root) {
		
		if(root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data +" ");
			inOrderTraversal(root.right);
		}
		
	}
	
}
