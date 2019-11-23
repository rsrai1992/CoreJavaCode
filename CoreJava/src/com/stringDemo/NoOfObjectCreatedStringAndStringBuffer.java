package com.stringDemo;

public class NoOfObjectCreatedStringAndStringBuffer {

	static int objCount;
	public NoOfObjectCreatedStringAndStringBuffer() {
		objCount +=1;
	}
	public static void main(String[] args) {
		String s1 = new String("Novopay");
		String s2 = new String("Novopay");
		String s3 = "Novopay";
		String s4 = "Novopay";
		System.out.println("No of object created : "+objCount);
	}

}
