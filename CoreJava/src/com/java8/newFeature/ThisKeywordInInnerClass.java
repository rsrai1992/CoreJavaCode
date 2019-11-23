package com.java8.newFeature;

interface InterfThis{
	public void m1();
}

class Test1{
	int x = 888;
	public void m2() {
		/*
		InterfThis i = new InterfThis() {
			int x = 999;
			@Override
			public void m1() {
				System.out.println("Instance Variable : "+this.x);
				System.out.println("Class variable : "+Test1.this.x);
			}
		}; */
		
		InterfThis i = ()->{
			int x = 999;
			System.out.println(x);
			System.out.println(this.x);
		};
		i.m1();
	}
}

public class ThisKeywordInInnerClass {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m2();
	}

}
