package com.user.input;

import java.util.Scanner;

public class ScannerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name");
		String name=sc.next();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Your name is "+name+" and you are "+age+" years old.");

	}

}
