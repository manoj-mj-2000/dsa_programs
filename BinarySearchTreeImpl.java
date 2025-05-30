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
		
		BinarySearchTree.inOrderTraversal(bst.root);
		
		if(bst.search(bst.root, 2)== null) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found");
		}
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
			System.out.println(root.data);
			inOrderTraversal(root.right);
		}
		
	}
	
}
