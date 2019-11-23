package com.coding.challenge;

import java.util.Scanner;

public class CountingValley {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter the input string");
		String s = sc.next();
		int count = 0;
		int vCount = 0;
		char input [] = s.toCharArray();
		for(int i=0; i<n; i++) {
			if(input[i]=='U') {
				if(count==-1) {
					vCount++;
				}
				count++;
			}
			else {
				count--;
			}
			System.out.println("Count : "+count+" vCount : "+vCount);
		}
		System.out.println("Number of valley Count : "+vCount);

	}

}
