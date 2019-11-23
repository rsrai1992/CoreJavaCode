package com.treeDS.learning;

public class PrintOddNodeOfBinaryTree {
	
	//create tree
			static class Node{
				int key;
				Node left, right;
			}
			
   //Utility function to create a new BST node
			static Node newNode(int item) {
				Node temp = new Node();
				temp.key = item;
				temp.left = null;
				temp.right = null;
				return temp;
			}
			
 //A utility function to do in-order traversal of BST	
			void inorder(Node root) {
				if(root != null) {
					inorder(root.left);
					System.out.println(root.key+" ");
					inorder(root.right);
				}
			}
			
 //A utility function to insert a new node with given key in BST
			static Node insert(Node node, int key) {
				if(node == null)
					return newNode(key);
				if(key<node.key)
					node.left = insert(node.left, key);
				else
					node.right = insert(node.right, key);
				return node;
			}
	// Function to print all odd node
			static void oddNode(Node root) {
				if(root != null) {
					oddNode(root.left);
					//it node is odd then print it
					if(root.key%2 !=0)
						System.out.println(root.key +" ");
					oddNode(root.right);
				}
			}

	public static void main(String[] args) {
		
		Node root = null;
		root = insert(root,5);
		root = insert(root,3);
		root = insert(root,2);
		root = insert(root,4);
		root = insert(root,7);
		root = insert(root,6);
		root = insert(root,8);
		oddNode(root);
	}

}
