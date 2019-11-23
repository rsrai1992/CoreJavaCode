package com.java8.oreilly;

interface IMovie{
	public boolean check(int id);
}

public class MethodReference {
	
	// static method reference usage
	public void testMovieStaticMethodRef() {
		// using Lambda
		IMovie m1 = (i) -> i<100?true:false;
		// using method reference
		IMovie m2 = MethodReference::isClassic;
		
	}
	
	//Instance method refrence usage
	private void testMovieInstanceMethodRef() {
		MethodReference ref = new MethodReference();
		IMovie m1= (i) -> i>10 && i<100 ? true:false;
		IMovie m2 = ref:: isTop10;
	}
	
	public static boolean isClassic(int movieId){
		return false;
	}
	
	public boolean isTop10(int movieId) {
		return true;
	}

	public static void main(String[] args) {
		MethodReference client = new MethodReference();

	}

}
