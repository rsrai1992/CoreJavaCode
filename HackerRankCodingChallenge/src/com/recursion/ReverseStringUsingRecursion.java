package com.recursion;

import java.util.Scanner;

public class ReverseStringUsingRecursion {
	
	public static String reverseIteratively(String input) {
		char[] reverse = new char[input.length()];
		for(int i=input.length()-1; i>=0; i--) {
			reverse[input.length()-1 - i] = input.charAt(i);
		}
		return new String(reverse);
	}
	
	public static String reverseWithoutExtraSpace(char[] input) {
		for(int i=0; i<input.length/2; i++) {
			char c = input[i];
			input[i] = input[input.length-1-i];
			input[input.length-1-i] = c;
		}
		return new String(input);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		char[] ch = s.toCharArray();
		//System.out.println("Reversed string is : "+reverseIteratively(s));
		System.out.println("Reversed string is : "+reverseWithoutExtraSpace(ch));

	}

}
