package com.stackImplementation;

class Stack2 {
	private int arr[];
	private int top;
	private int capacity;

	Stack2(int size) {
		arr = new int[size];
		top = -1;
		capacity = size;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack is full, execution terminated.");
		} else {
			System.out.println("Inserting element : " + x);
			arr[++top] = x;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty, execution terminated.");
			return -1;
		}
		else {
			System.out.println("Removing "+peek());
			return arr[top--];
		}
	}

	public int peek() {
		if(!isEmpty()) {
			return arr[top];
		}
		else {
			return -1;
		}
	}

	private boolean isEmpty() {
		return top == -1;
	}

	private boolean isFull() {
		return top == capacity - 1;
	}
	
	public void showElement() {
		System.out.println("Elements of Stack : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

public class StackDemo {

	public static void main(String[] args) {
		Stack2 s = new Stack2(3);
		s.push(1);
		s.push(2);
		s.push(3);
		s.showElement();
		System.out.println("Peek : "+s.peek());
		System.out.println("Peek : "+s.pop());
		System.out.println("Peek : "+s.pop());
		System.out.println("Peek : "+s.pop());
		System.out.println("Peek : "+s.pop());
		//s.showElement();
	}

}
