package com.linkedList.code;

public class SwappingOfTwoAdjacentNodes {

	public static void printLinkedList(Node head) {
		Node i = head;
		while (i != null) {
			System.out.print(i.data + " -> ");
			i = i.next;
		}
		System.out.println();
	}

	public static Node swapInPairs(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node curNode = head;
		Node previousNode = null;
		while (curNode != null && curNode.next != null) {
			Node temp = curNode.next;
			curNode.next = temp.next;
			temp.next = curNode;
			if (previousNode == null) {
				head = temp;
			} else {
				previousNode.next = temp;
			}
			previousNode = curNode;
			curNode = curNode.next;
		}
		return head;
	}
	
	public static Node swapInPairsUsingRecursion(Node head, Node prev) {
		if (head == null || head.next == null) {
			return head;
		}
		Node curNode = head;
		Node temp = curNode.next;
		curNode.next = temp;
		temp.next = curNode;
		if(prev == null)
			head = temp;
		else
			prev.next = temp;
		
		prev = curNode;
		Node head1 = swapInPairsUsingRecursion(curNode.next, prev);
		return head1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Node head = null;
		for (int i = arr.length - 1; i >= 0; i--) {
			head = new Node(arr[i], head);
		}
		System.out.println("Before LinkedList : ");
		printLinkedList(head);
		System.out.println("After swapping : ");
		//head = swapInPairs(head);
		head = swapInPairsUsingRecursion(head, null);
		printLinkedList(head);
	}

}
