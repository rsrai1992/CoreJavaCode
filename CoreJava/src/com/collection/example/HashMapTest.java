package com.collection.example;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		String s = "ravi rai";
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put(s.split(" ")[0],s.split(" ")[1]);
		System.out.println(hm);

	}

}
