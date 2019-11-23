package com.java8.newFeature;
interface Interf{
	public void m1();
}

class Demo implements Interf{
	public void m1() {
		System.out.println("m1() implemented methods.");
	}
}
public class FunctionalInterf2 {

	public static void main(String[] args) {
		Interf i = new Demo();
		i.m1();
	}

}
