package com.collection.example;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp{

	@Override
	public String toString() {
		return "Temp []";
	}
	
	public void finalize() {
		System.out.println("Finalize method is called.");
	}
	
}

public class WeakHashMapDemo {

	public static void main(String[] args) {
		//HashMap hm = new HashMap();
		WeakHashMap hm = new WeakHashMap();
		Temp t = new Temp();
		hm.put(t, "WeakHashMap");
		System.out.println(hm);
		t = null;
		System.gc();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println(hm);
		
	}

}
