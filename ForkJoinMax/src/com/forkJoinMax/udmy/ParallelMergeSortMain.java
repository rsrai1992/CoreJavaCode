package com.forkJoinMax.udmy;

import java.util.concurrent.ForkJoinPool;

public class ParallelMergeSortMain {

	public static void main(String[] args) {
		
		int[] num = {1,5,4,4,-1,0,4,5,7,8,9};
		
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		ParallelMergeSort parallelMergeSort = new ParallelMergeSort(num);
		pool.invoke(parallelMergeSort);
		
		for(int i=0;i< num.length; i++)
			System.out.print(num[i]+" ");

	}

}
