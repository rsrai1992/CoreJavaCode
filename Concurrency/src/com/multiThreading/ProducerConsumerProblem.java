package com.multiThreading;

import java.util.LinkedList;

class ProducerAndConsumer {

	LinkedList<Integer> pList = new LinkedList<>();
	final int capacity = 2;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				while (pList.size() == capacity)
					wait();

				System.out.println("Produced Value : " + value);
				pList.add(value);
				value++;
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (pList.size() == 0)
					wait();

				int val = pList.removeFirst();
				System.out.println("Cosuming Value : " + val);
				notify();
				Thread.sleep(1000);
			}
		}
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) throws InterruptedException {
		ProducerAndConsumer pc = new ProducerAndConsumer();
		Runnable r1 = () -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable r2 = () -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}

}
