package com.multiThreading.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Runnable {
	
	public static void main(String[] args) {
		final List<Book> list =  Arrays.asList(new Book(1, "Ramayan"), new Book(2, "Mahabharat"));
//		Runnable r1 = () -> list.forEach(Book::print);
//		Thread th1 = new Thread(r1);
//		th1.start();
		Runnable r2 = () -> {
			Consumer<Book> style = (Book b) -> System.out.println("Book Id:"+b.getId() + ", Book Name:"+b.getName());
			list.forEach(style);
		};
		Thread th2 = new Thread(r2);
		th2.start();
	}

}
