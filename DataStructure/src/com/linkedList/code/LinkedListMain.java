package com.linkedList.code;

public class LinkedListMain {

	static Node tailNode;
	static Node headNode;
	static int cnt1;
	public static void main(String[] args) {
		
		Node head = new Node(10,null);
		headNode = head;
		Node l1 = new Node(20,null);
		head.next = l1;

		Node l2 = new Node(30,null);
		l1.next = l2;
		Node l3 = new Node(40,null);
		l2.next = l3;
		
		tailNode = headNode;
		while(tailNode.next != null) {
			tailNode = tailNode.next;
		}
		
		// appendNode(75);
		// addLastNode(l3, 55);
		// addAtFront(70);
	
		addAtMiddle(101);
		
		Node temp = headNode;
		while(temp != null) {
			System.out.println(temp);
			temp = temp.next;
		}	
		System.out.println("head : "+ headNode);
		System.out.println("tail : "+ tailNode);
	}
	public static void appendNode(int nodeValue)
	{
		Node lastNode = new Node(nodeValue);
		tailNode.next = lastNode;
		lastNode.next = null;
		tailNode = lastNode;
	}
	
	public static void addAtFront(int nodeValue)
	{
		Node newNode = new Node(nodeValue);
		newNode.next = headNode;
		headNode = newNode;
	}
	
	public static void addLastNode(Node lastNode, int nodeValue) {
		Node nodeTail = new Node(nodeValue,null); 
		lastNode.next=nodeTail;
	}
	
	public static void addAtMiddle( int nodeValue) {
		//System.out.println(headNode);
		Node tmpNode = headNode;
		int count = 1;
		while(count <= 3) {
			tmpNode = tmpNode.next;
			count++;
		}
		//System.out.println("tmp_node : "+tmpNode);
		//System.out.println(count);
		Node newNode = new Node(nodeValue);
		newNode.next = tmpNode.next;
		tmpNode.next = newNode;
	}

}
