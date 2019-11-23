package com.dynamicProgramming;

import java.util.Scanner;

public class FibonacciMemoization {
	
	public static int fibMemoization(int n,int [] tmp) {
		if(tmp[n] != -1) {
			return tmp[n];
		}
		if(n <=1 ) {
			return n;
		}
		else
		{
			tmp[n] =  fibMemoization(n-1,tmp)+fibMemoization(n-2,tmp);
		}
		//System.out.println(tmp[n]);
		return tmp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth element : ");
		int n = sc.nextInt();
		int memoi[] = new int[n];
		for(int i = 0; i<n ; i++) {
			memoi[i] = -1;
		}
		int result = fibMemoization(n-1, memoi);
		System.out.println(n+"th elements of fibonacci series : "+result);

	}

}
