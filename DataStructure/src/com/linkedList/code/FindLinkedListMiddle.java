package com.linkedList.code;

public class FindLinkedListMiddle {
	
	public static void printNode(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp);
			temp = temp.next;
		}
	}
	
	public static void findMiddle(Node head) {
		int cnt = 0;
		int middle = 0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			cnt++;
		}
		if(cnt%2 != 0)
		{
			middle = cnt/2+1;
		}
		else
		{
			middle = cnt/2+1;
		}
		Node middleNode = head;
		int v = 0;
		while(middleNode != null)
		{
			v++;
			if(v == middle)
			System.out.println("Middle node of linked list : "+middleNode);
			middleNode=middleNode.next;
		}
	}

	static Node headNode;
	public static void main(String[] args) {
		Node n1 = new Node(10,null);
		headNode = n1;
		Node n2 = new Node(20,null);
		n1.next = n2;
		Node n3 = new Node(40,null);
		n2.next = n3;
		Node n4 = new Node(50,null);
		n3.next = n4;
		Node n5 = new Node(70,null);
		n4.next = n5;
//		Node n6 = new Node(80,null);
//		n5.nextNode = n6;
		
		printNode(headNode);
		findMiddle(headNode);
	}

}
