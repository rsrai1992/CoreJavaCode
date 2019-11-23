package com.coding.challenege;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationCodeMonk {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int c = s.nextInt();
	        while(c>0){
			int t = s.nextInt();
			int k = s.nextInt();
			int arr[] = new int[t];
			int tempArr[]= new int[t];
			for(int i=0; i<t; i++) {
				arr[i] = s.nextInt();
			}
			for(int m=0; m< k%t; m++)
			{
				tempArr[0]= arr[t-1];
				for(int j=1; j<tempArr.length; j++) {
					tempArr[j] = arr[j-1];
				}
				arr = Arrays.copyOf(tempArr, t);
			}
			for(int n=0; n<arr.length; n++)
			{
				System.out.print(arr[n]+" ");
			} 
			c--;
	    }

	}
}
