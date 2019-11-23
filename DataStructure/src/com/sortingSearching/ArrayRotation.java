package com.sortingSearching;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the no. of element to rotate : ");
		int d = sc.nextInt();
		System.out.println("Before rotating :");
		printArray(arr);
		System.out.println();
		System.out.println("After rotating :");
		rotate(arr,d);
		printArray(arr);
	}
	
	public static void rotate(int[]a, int r) {
		for(int i=0; i<r; i++) {
		int temp = a[0];
		for(int j=0; j<a.length-1; j++) {
			a[j] = a[j+1];
		}
		a[a.length-1] = temp;
		}
	}

	public static void printArray(int[] ra) {
		for(int e:ra) {
			System.out.print(e+" ");
		}
	}
}
