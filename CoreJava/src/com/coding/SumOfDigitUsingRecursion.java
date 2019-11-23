package com.coding;

import java.util.Scanner;

public class SumOfDigitUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Sum of digut : " + digitSum(n));
	}

	public static int digitSum(int a) {
		int sum = 0;
		while (a > 0) {
			sum = sum + a % 10;
			a = a / 10;
		}
		if (sum > 9)
			return digitSum(sum);
		else
			return sum;
	}

}
