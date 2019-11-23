package com.java8.newFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamTest{
	public int sumIterator(List<Integer> list) {
		/*
		Iterator<Integer> itr = list.iterator();
		int sum = 0;
		while(itr.hasNext()) {
			int num = itr.next();
			if(num>10)
			sum = sum + num;
		}
		return sum;
	} */
		return list.stream().filter(i-> i>10).mapToInt(i->i).sum();
		}
}

public class StreamAPI {

	public static void main(String[] args) {
		/*
		ArrayList<Integer> al = new ArrayList<Integer>();
		StreamTest s= new StreamTest();
		al.add(5);
		al.add(15);
		al.add(10);
		al.add(20);
		int res = s.sumIterator(al);
		System.out.println("Sum is : "+res);
		Stream<Integer> stream = Stream.of(1,2,3,4);
		Stream<Integer> stream1 = Stream.of(new Integer[] {1,2,3,4,5});
		//Stream<Integer> stream2 = Stream.of(new int[] {1,2,3,4,5});
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) 
			myList.add(i);
		
		Stream<Integer> sequentialStream = myList.stream();
		Stream<Integer> parallelStream = myList.parallelStream();
		
		Stream<String> stringStream = Stream.generate(()->{return "Stream";});
		Stream<String> stringStream2 = Stream.iterate("Stream", (i)->i);
		/*
		Stream<Integer> intStream = Stream.of(1,2,3,4);
		List<Integer> intList = intStream.collect(Collectors.toList());
		System.out.println(intList);
		*/
		/*
		ArrayList<Integer> myList1 = new ArrayList<Integer>();
		for(int i=0; i<50; i++)
			myList1.add(i);
		Stream<Integer> myList1Stream = myList1.stream();
		Stream<Integer> highNums = myList1Stream.filter(p->p%2 == 0);
		System.out.println("Even numbers :");
		highNums.forEach(p-> System.out.print(p+" "));
		
		
		ArrayList<Integer> sortList = new ArrayList<Integer>();
		sortList.add(4);
		sortList.add(20);
		sortList.add(8);
		sortList.add(12);
		sortList.add(10);
		sortList.add(15);
		//sortList.stream().sorted().forEach(System.out::println);
		List<Integer> l1 = sortList.stream().filter(I->I%2==0).collect(Collectors.toList());
		List<Integer> l2 = sortList.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println(l2); 
		

        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		Optional<Integer> intOptional = numbers.reduce((i,j) -> {return i*j;});
        if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get()); //120
        
		ArrayList<Integer> sortList = new ArrayList<Integer>();
		sortList.add(4);
		sortList.add(20);
		sortList.add(8);
		sortList.add(12);
		sortList.add(10);
		sortList.add(15);
		System.out.println("Count of elements : "+sortList.stream().count());
		System.out.println(sortList.stream().anyMatch(i->i==10));
		
		List<Integer> ss = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1,2);
		List<Integer> result = new ArrayList<Integer>(); 
		Stream<Integer> stream = ss.parallelStream();
		stream.map(s -> {
		        synchronized (result) {
		          if (result.size() < 10) {
		            result.add(s);
		          }
		        }
				return s;
		    }).forEach( e -> {});
		 System.out.println(result);  */
		List<Integer> ss = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1,2);
		ss.stream().distinct().forEach(System.out::println);
	}
}
