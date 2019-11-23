package com.stackImplementation;

import java.util.Scanner;
import java.util.Stack; 

public class MatchParenthsisUsingStack {
	public static boolean hasMatchingParenthsis(String input) {
	    Stack<Character> parenStack = new Stack<>();
	    for(int i=0; i<input.length(); i++) {
	    	char c = input.charAt(i);
	    	if(c=='(' || c=='{' || c == '[') {
	    		parenStack.push(c);
	    	}
	    	if(c == ')'|| c =='}'|| c== ']') {
	    		if(parenStack.isEmpty())
	    			return false;
	    		char lastParen = parenStack.peek();
	    		if(c == ')' && lastParen == '(' || c =='}' && lastParen =='{' || c==']' && lastParen=='[' ) {
	    			parenStack.pop();
	    		}
	    		else {
	    			return false;
	    		}
	    	}	
	    }
	    return parenStack.isEmpty() ? true:false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string : ");
		String s = sc.next();
		boolean r = hasMatchingParenthsis(s);
		if(r)
			System.out.println("Matching parenthsis");
		else
			System.out.println("Non-matching parenthsis");

	}

}
