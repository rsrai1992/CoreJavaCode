package com.coding.challenege;

import java.util.Scanner;

public class LeftRigtEqualSum {
	
	public static boolean addSum(int tmpArray[], int index) {
		int sum1 = 0;
		int sum2 = 0;
	    for(int i=0; i< index; i++) {
	    	sum1 = sum1 + tmpArray[i];
	    }
	    for(int j=index+1; j<tmpArray.length; j++) {
	    	sum2 = sum2 + tmpArray[j];
	    }
	    if(sum1==sum2)
	    	return true;
	    else 
	    	return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the length of array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    boolean result = false;
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=1; j<arr.length; j++) {		
			result = addSum(arr,j);
			// System.out.println("result :"+result);
			if (result == true) {
				System.out.println("Index of equal left right sub-array is : "+j);
				break;
			}
		}

	}

}
