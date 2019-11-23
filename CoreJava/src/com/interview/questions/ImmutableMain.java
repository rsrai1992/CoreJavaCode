package com.interview.questions;

public class ImmutableMain {

	public static void main(String[] args) {
		ImmutableClass obj = new ImmutableClass(10, 20);
		obj.a=50;
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
