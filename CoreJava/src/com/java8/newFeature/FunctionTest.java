package com.java8.newFeature;

interface Interf11{
	//public void add(int a, int b);
	public int getLength(String s);
}

public class FunctionTest {

	public static void main(String[] args) {
		/*
		Interf11 i = (a,b) ->System.out.println("The sum is : "+(a+b));
		i.add(10, 20);
		i.add(12, 13); */
		
		Interf11 i = s-> s.length();
		System.out.println(i.getLength("Hello"));
		System.out.println(i.getLength("with lambda expression"));
	}

}
