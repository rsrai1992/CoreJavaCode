package com.stackImplementation; 
import java.util.Stack; 

class Stack1{
	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> minStack = new Stack<>();
	
	public void push(int data) {
		int min = data;
		if(!minStack.isEmpty()) {
			if(min > minStack.peek())
				min = minStack.peek();
		}
		stack.push(data);
		minStack.push(min);
	}
	
	public int getMin() {
		return minStack.peek();
	}
	
	public int pop() {
		minStack.pop();
		return stack.pop();
	}
	
}

public class MinElementInConstantTime {
	public static void main(String[] args) {
		Stack1 s = new Stack1();
		s.push(3);
		s.push(5);
		s.push(2);
		s.push(1);
		System.out.println("Minimun of stack : "+s.getMin());
		s.pop();
		System.out.println("Minimun of stack : "+s.getMin());
	}

}
