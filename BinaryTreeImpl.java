//$Id$
package com.dsa;

public class BinaryTreeImpl {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(10);
		
		bt.insertLeft(bt.root, 2);
		bt.insertLeft(bt.root.left, 3);
		bt.insertRight(bt.root.left, 4);
		bt.insertRight(bt.root, 5);
		bt.insertLeft(bt.root.right, 6);
		bt.insertRight(bt.root.right, 7);

		System.out.println("PreOrder: ");
		BinaryTree.preOrderTraversal(bt.root);
		System.out.println("InOrder: ");
		BinaryTree.inOrderTraversal(bt.root);
		System.out.println("PostOrder: ");
		BinaryTree.postOrderTraversal(bt.root);
	}

}

class BinaryTree{
	
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
	
	public BinaryTree(int n){
		root = new Node(n);
	}

	public void insertLeft(Node r, int val) {
		Node node = new Node(val);
		r.left = node;
	}
	
	public void insertRight(Node r, int val) {
		Node node = new Node(val);
		r.right = node;
	}
	
	
	public static void inOrderTraversal(Node root) {
		
		if(root != null) {
			inOrderTraversal(root.left);
			System.out.println(root.data);
			inOrderTraversal(root.right);
		}
		
	}

	public static void postOrderTraversal(Node root) {
				
		if(root != null) {
			inOrderTraversal(root.left);
			inOrderTraversal(root.right);
			System.out.println(root.data);			
		}
	}

	public static void preOrderTraversal(Node root) {
		
		if(root != null) {
			System.out.println(root.data);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
		
	}
	
}
