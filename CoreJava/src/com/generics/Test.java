package com.generics;

public class Test<T extends Number> {
	public void display() {
		System.out.println("Type of object : ");
	}

}

class TestDemo{
	public static void main(String[] args) {
		Test<Integer> t = new Test<Integer>();
	}
}
