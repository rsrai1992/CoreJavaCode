package com.linkedList.code;

class CLNode{
	int data;
	CLNode next;
	public CLNode(int data) {
		this.data = data;
	}
	
}

public class CircularLinkedList {
	static CLNode last;
	
	public static void createCList() {
		CLNode first = new CLNode(1);
		CLNode second = new CLNode(5);
		CLNode third = new CLNode(10);
		CLNode fourth = new CLNode(15);
		CLNode fifth = new CLNode(20);
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = first;
		last = fifth;
	}
	
	public static void displayCL(CLNode last) {
		
		CLNode first = last.next;
		 do{
			System.out.print(first.data+" -> ");
			first = first.next;
		}while(first != last);
		 System.out.print(first.data);
		
	}
	
	public static void append(int value) {
		CLNode newNode = new CLNode(value);
		newNode.next = last.next;
		last.next = newNode;
		
		last = newNode;
	}

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.createCList();
		System.out.println("Linkedlist before append :");
		cll.displayCL(last);
		cll.append(22);
		cll.append(30);
		System.out.println();
		System.out.println("Linkedlist after append :");
		cll.displayCL(last);
		
	}

}
