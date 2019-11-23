package com.user.interfaceDemo;

public class InterfaceDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Compute ptr;
		ptr = c1;
		ptr.add();
		ptr.sub();
		((Calculator)(ptr)).mult();

	}

}
