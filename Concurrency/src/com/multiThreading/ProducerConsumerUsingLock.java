package com.multiThreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class WorkerThread {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void producer() throws InterruptedException {
		lock.lock();
		System.out.println("Producer method..!!");
		condition.await();
		System.out.println("Producer method agian..!!");
		lock.unlock();
	}

	public void consumer() throws InterruptedException {
		lock.lock();
		Thread.sleep(2000);
		System.out.println("Consumer method..!!");
		condition.signal();
		lock.unlock();

	}
}

public class ProducerConsumerUsingLock {

	public static void main(String[] args) {
		
		WorkerThread wt = new WorkerThread();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					wt.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					wt.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
