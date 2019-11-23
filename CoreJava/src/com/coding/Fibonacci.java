package com.coding;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[]srgs) {
		int a = 0;
		int b = 1;
		int sum = 0;
		int count = 2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of Fibonacci Series :");
	int n =sc.nextInt();
	System.out.print(a+" "+b+" ");
	while( n != count) {
		sum = a+b;
		System.out.print(sum+" ");
		a = b;
		b = sum;
		count++;
	}
	}
}
