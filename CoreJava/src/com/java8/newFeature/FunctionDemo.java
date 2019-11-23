package com.java8.newFeature;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> f = s->s.length();
		Function<Integer, Integer> f1 = i->i*i;
		
		Consumer<String> c = s->System.out.println(s);
		
		System.out.println(f.apply("ravi"));
		System.out.println(f1.apply(5));
		c.accept("Consumer functional interface");

	}

}
