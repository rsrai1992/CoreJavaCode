package com.collection.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {
	
	//static HashMap<Integer,String> hm = new HashMap<Integer,String>();
	static ConcurrentHashMap<Integer, String> hm = new ConcurrentHashMap<Integer, String>();
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child thread is adding elements..");
		hm.put(104, "D");
	}

	public static void main(String[] args) throws InterruptedException {
		hm.put(101, "A");
		hm.put(102, "B");
		hm.put(103, "C");
		
		ConcurrentHashMapDemo t = new ConcurrentHashMapDemo();
		t.start();
		Set s1=hm.keySet();
		Iterator<Integer> itr = s1.iterator();
		while(itr.hasNext()) {
			Integer I1 = (Integer) itr.next();
			System.out.println("Main thread is iterating map and current Key is : "+I1+" : value : "+hm.get(I1));
			Thread.sleep(3000);
		}
		System.out.println(hm);
	}

}
