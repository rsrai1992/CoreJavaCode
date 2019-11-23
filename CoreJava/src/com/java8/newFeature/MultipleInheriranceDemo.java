package com.java8.newFeature;

interface Left{
	default void m1() {
		System.out.println("Left default method.");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right default method.");
	}
}

class TestD implements Left, Right{
	public void m1() {
		System.out.println("My Own Implementation");
		Left.super.m1();
		Right.super.m1();
	}
}
public class MultipleInheriranceDemo {

	public static void main(String[] args) {
		TestD t = new TestD();
		t.m1();

	}

}
