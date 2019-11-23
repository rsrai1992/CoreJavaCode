package com.java8.newFeature;
interface Interf3{
	public int getLength(String s);
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		Interf3 i = s-> s.length() ;
		System.out.println(i.getLength("Hello"));
		System.out.println(i.getLength("with lambda expression"));
	}

}
