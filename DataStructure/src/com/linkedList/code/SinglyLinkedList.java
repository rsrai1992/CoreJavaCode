package com.linkedList.code;

class SinglyNode{
	
	int data;
	SinglyNode next;
	
	public SinglyNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SinglyLinkedList {
	
	SinglyNode head;
	
	public static void printList(SinglyLinkedList list) {
		SinglyNode currentNode = list.head;
		//traverse through LinkedList
		System.out.println("LinkedList : ");
		while(currentNode != null) {
			System.out.print(currentNode.data+" --> ");
			currentNode = currentNode.next;
		}
		System.out.println("\n");
	}
	
	public static SinglyLinkedList insertNode(SinglyLinkedList list, int data) {
		
		SinglyNode newNode = new SinglyNode(data);
		newNode.next = null;
		if(list.head == null) {
			list.head = newNode;
		}
		else {
			SinglyNode last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}
	
	public static SinglyLinkedList insertInMiddle(SinglyLinkedList list, SinglyNode node,int n) {
		int cnt = 1;
		SinglyNode currentNode = list.head;
		SinglyNode nextNode=null;
		while(currentNode!= null) {
			currentNode = currentNode.next;
			cnt++;
			if(cnt == n-1) {
				nextNode = currentNode.next;
				currentNode.next=node;
				node.next = nextNode;	
			}
		}
		return list;
		
	}

	public static void deleteByKey(SinglyLinkedList list, int key) {
		SinglyNode currNode = list.head;
		SinglyNode previous = null;
		if(currNode != null &&currNode.data == key) {
			list.head = currNode.next;
			System.out.println("Key found as head and deleted.");
		}
		else {
		while(currNode != null) {
			if(currNode.data == key) {
				previous.next = currNode.next;
				System.out.println("Node found and deleted.");
				return;
			}
			previous = currNode;
			currNode = currNode.next;	
		}
		}
		
	}
	public static void main(String[] args) {

		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList = insertNode(singlyLinkedList, 5);
		singlyLinkedList = insertNode(singlyLinkedList, 10);
		singlyLinkedList = insertNode(singlyLinkedList, 15);
		singlyLinkedList = insertNode(singlyLinkedList, 20);
		singlyLinkedList = insertNode(singlyLinkedList, 25);
		singlyLinkedList.printList(singlyLinkedList);
		// singlyLinkedList.deleteByKey(singlyLinkedList, 5);
		insertInMiddle(singlyLinkedList,new SinglyNode(50),3);
		insertInMiddle(singlyLinkedList,new SinglyNode(200),7);
		printList(singlyLinkedList);
		singlyLinkedList.deleteByKey(singlyLinkedList, 15);
		printList(singlyLinkedList);
		
	}

}
