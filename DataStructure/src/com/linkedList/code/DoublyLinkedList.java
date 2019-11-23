package com.linkedList.code;

class DoublyNode{
	int data;
	DoublyNode next;
	DoublyNode previous;
	public DoublyNode(int data) {
		this.data = data;
	}
	
}

public class DoublyLinkedList {
	
	static DoublyNode head;
	
	public static void append(int value) {
		DoublyNode newNode = new DoublyNode(value);
		DoublyNode last = head;
		newNode.next = null;
		// if linkedlist is empty
		if(head==null) {
			newNode.previous = null;
			head = newNode;
		}
		else {
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
			newNode.previous = last;
		}
	}
	public static void addFirst(int value) {
		DoublyNode newNode = new DoublyNode(value);
		newNode.next = head;
		newNode.previous = null;
		head.previous = newNode;
		head = newNode;
		
	}
	
	public static void insertAfter(DoublyNode preNode, int value) {
		DoublyNode newNode = new DoublyNode(value);
		
		newNode.next =preNode.next;
		preNode.next = newNode;
		newNode.previous = preNode;
		newNode.next.previous = newNode;
		
	}
	
	public static void delete(DoublyNode headRef, DoublyNode del) {
		if(headRef == null || del == null) {
			System.out.println("Head reference or node to deleted is null.");
			return;
		}
		if(head == del) {
			head = del.next;
			del.previous = null;
		}
		else {
		del.next.previous = del.previous;
		del.previous.next = del.next;	
		}
	}
	
	public static void printList(DoublyNode node) {
		DoublyNode last = null;
		while(node != null) {
			System.out.print(node.data+" -> ");
			last = node;
			node = node.next;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.append(5);
		dll.append(10);
		dll.append(15);
		dll.addFirst(1);
		dll.addFirst(3);
		dll.insertAfter(dll.head.next, 50);
		System.out.println("Before deleting : ");
		dll.printList(dll.head);
		dll.delete(dll.head, dll.head);
		System.out.println();
		System.out.println("After deleting : ");
		dll.printList(dll.head);

	}

}
