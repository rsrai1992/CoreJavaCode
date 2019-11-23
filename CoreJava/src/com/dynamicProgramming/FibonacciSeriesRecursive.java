package com.dynamicProgramming;

import java.util.Scanner;

public class FibonacciSeriesRecursive {
	
	public static int fib(int n) {
		if(n <= 1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth element : ");
		int i = sc.nextInt();
//		int result = fib(i);
//		System.out.println(i+" element is : "+result);
		System.out.println("Fibonacci series is : ");
		for(int j=0; j<i;j++) {
			System.out.print(fib(j)+" ");
		}

	}

}
