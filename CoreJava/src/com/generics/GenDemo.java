package com.generics;

class Gen<T> {
	T ob;

	public Gen(T ob) {
		this.ob = ob;
	}
	
	public void show() {
		System.out.println("The type of object :"+ob.getClass().getName());
	}
	
	public T getOb() {
		return ob;
	}

}
class GenDemo{
	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>("ravi");
		g1.show();
		System.out.println(g1.getOb());
	}
}
