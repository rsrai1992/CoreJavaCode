package com.collection.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

class MyComprator implements Comparator {

	@Override
	public int compare(Object arg1, Object arg2) {
		   HashMap<String, Integer> hm1= new HashMap<String, Integer>();
		   hm1.put(arg1.toString().split(" ")[1], Integer.parseInt(arg1.toString().split(" ")[0]));
		   HashMap<String, Integer> hm2= new HashMap<String, Integer>();
		   hm2.put(arg2.toString().split(" ")[1], Integer.parseInt(arg2.toString().split(" ")[0]));
		  if(hm1.containsKey("GB")&&(hm2.containsKey("MB")||hm2.containsKey("KB"))) {
			  return 1;
		  }
		  else if(hm1.containsKey("MB")&&hm2.containsKey("KB")) {
			  return 1;
		  }else if(hm1.containsKey("MB")&&hm2.containsKey("MB")) {
			  return  hm1.get("MB") - hm2.get("MB");
		  }
		  else if(hm1.containsKey("KB")&&hm2.containsKey("KB")) {
			  return  hm1.get("KB") - hm2.get("KB");
		  }
		  else if(hm1.containsKey("GB")&&hm2.containsKey("GB")) {
			  return  hm1.get("GB") - hm2.get("GB");
		  }
		  else {
			  return -1;
		  }
	}

}

public class SortingNetSpeedUsingCompator {

	public static void main(String[] args) {
		MyComprator myComprator = new MyComprator();
		TreeSet<String> ts = new TreeSet<String>(myComprator);
		ts.add("10 GB");
	    ts.add("100 KB");
		ts.add("90 MB");
		ts.add("1 GB");
		ts.add("900 KB");
		ts.add("100 MB");
		ts.add("750 MB");
		ts.add("750 KB");
	
		System.out.println(ts);

	}

}
