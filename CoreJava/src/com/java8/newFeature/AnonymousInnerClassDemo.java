package com.java8.newFeature;
interface Test{
	public void m1();
	public void m2();
	public void m3();
}

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		Test t = new Test() {
			public void m1() {
				System.out.println("method m1");
			}
			public void m2() {
				System.out.println("method m2");
			}
			public void m3() {
				System.out.println("method m3");
			}
		};

		t.m1();
		t.m2();
		t.m3();
	}

}
