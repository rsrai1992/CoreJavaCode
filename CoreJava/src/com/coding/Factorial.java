package com.coding;

import java.util.Scanner;

public class Factorial {
	
	public long fact(long n) {
		if (n==0) 
			return 1;
		else
			return n*fact(n-1);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		long num =sc.nextLong();
		
		Factorial f = new Factorial();
		long result = f.fact(num);
        System.out.println("Result is :"+result);
	}

}
