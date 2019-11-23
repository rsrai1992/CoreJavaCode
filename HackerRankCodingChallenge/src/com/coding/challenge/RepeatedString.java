package com.coding.challenge;

import java.util.Scanner;

public class RepeatedString {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the string");
	String s = sc.next();
	s.length();
	System.out.println("Enter length of repeating string");
	int l = sc.nextInt();
	char c[] = s.toCharArray();
    long count = 0;
    for(long i=0; i<l; i++){
        long index = i%l;
        if(s.charAt((int) index)=='a')
        count++;
    }
    System.out.println("Count of a : "+count);
   }

}
