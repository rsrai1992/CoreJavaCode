package com.coding.challenege;

import java.util.Scanner;

public class LongestVowels {
	
	public static boolean isVowel(char temp) {
		if(temp =='a' || temp =='e' || temp =='i' || temp =='o' || temp =='u')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int finalCount = 0;
		int count = 0;
		char[] s1 = s.toCharArray();
		for(int i=0; i<s1.length; i++) {
			if(isVowel(s1[i])) 
				count++;
			else
				count = 0;
			if(finalCount < count)
				finalCount =  count;
		}
		System.out.println("Longest vowel length : "+finalCount);
	}
}
