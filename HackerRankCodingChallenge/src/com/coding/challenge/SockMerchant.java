package com.coding.challenge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length Array");
		int l = sc.nextInt();
		int ar[] = new int[l];
		System.out.println("Enter the Array");
		for(int k=0; k<l; k++) {
			ar[k]=sc.nextInt();
		}
        int lCount = 0;
        int count = 0;
    HashMap<Integer, Integer> hm = new HashMap<>();
    for(int i=0; i<l; i++){

        lCount = 0;
      for(int j=i; j<l; j++){
        if(ar[i]==ar[j])
        lCount++;
     }
     if(!hm.containsKey(ar[i])){
        hm.put((int) ar[i],lCount);  
        lCount = 0;
   }
}
   System.out.println(hm);
/*
Iterator it = hm.entrySet().iterator();
while (it.hasNext()) {
    Map.Entry pair = (Map.Entry)it.next();
    System.out.println(pair.getKey()+" : "+pair.getValue());
    // int val =  (int)pair.getValue();
    // count = count + val/2;
}
//System.out.println("Pair of count : "+count); */
	}

}
