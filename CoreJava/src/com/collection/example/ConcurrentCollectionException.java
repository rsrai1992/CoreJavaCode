package com.collection.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentCollectionException extends Thread {

	static ArrayList<String> l = new ArrayList<String>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child thread updating list..");
		l.add("D");
	}

	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("C");
		ConcurrentCollectionException t = new ConcurrentCollectionException();
		t.start();
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println("Main thread Iterating list and Current Object is :" + s);
			Thread.sleep(3000);
		}
		System.out.println(l);
	}

}
