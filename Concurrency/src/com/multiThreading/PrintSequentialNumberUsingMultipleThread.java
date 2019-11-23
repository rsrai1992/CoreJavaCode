package com.multiThreading;

class PrintNumber {
	int num = 0;
	public int print() {
		num++;
		return num;
	}

}

public class PrintSequentialNumberUsingMultipleThread {
	public volatile static int count = 1;

	public static void main(String[] args) {
		Runnable r1 = () -> {

		};

		Runnable r2 = () -> {

		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}
