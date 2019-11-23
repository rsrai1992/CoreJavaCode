package com.dynamicProgramming;

import java.util.Scanner;

public class FibonacciBottamUp {
	
	public static int fibBottomUp(int n) {
		if(n <= 1) {
			return n;
		}
		int bottomUp [] = new int[n+2];
		bottomUp[0] = 0;
		bottomUp[1] = 1;
		for(int i=2; i<=n; i++) {
			bottomUp[i] = bottomUp[i-1]+bottomUp[i-2];
			System.out.println(bottomUp[i]);
		}
		return bottomUp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth element : ");
		int n = sc.nextInt();
		int result = fibBottomUp(n);
		System.out.println(n+"th element of fibonacci servies : "+result);

	}

}
