package com.forkJoinMax.udmy;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class ParallelMergeSort extends RecursiveAction {
	
	private int[] nums;

	public ParallelMergeSort(int[] nums) {
		this.nums = nums;
	}

	@Override
	protected void compute() {
		if(nums.length <= 10) {
			mergeSort(nums);
			return;
		}	
		int middleIndex = nums.length/2;
		int[] leftSubArray = Arrays.copyOfRange(nums, 0, middleIndex);
		int[] rightSubArray = Arrays.copyOfRange(nums, middleIndex+1, nums.length);
		
		ParallelMergeSort leftTask = new ParallelMergeSort(leftSubArray);
		ParallelMergeSort rightTask = new ParallelMergeSort(rightSubArray);
		
		invokeAll(leftTask,rightTask);
		merge(leftSubArray, rightSubArray, nums);
		
	}
	
	public void mergeSort(int [] nums) {
		if(nums.length <=1)
			return;
		int midIndex = nums.length/2;
		int [] left = Arrays.copyOfRange(nums, 0, midIndex);
		int [] right = Arrays.copyOfRange(nums, midIndex, nums.length);
		
		mergeSort(left);
		mergeSort(right);
		
		merge(left,right,nums);
		
	}

	private void merge(int[] leftSubArray, int[] rightSubArray, int[] originalArray) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<leftSubArray.length && j<rightSubArray.length) {
			if(leftSubArray[i] < rightSubArray[j]) {
				originalArray[k++] = leftSubArray[i++];
			} else {
				originalArray[k++] = rightSubArray[j++];
			}
		}
		while(i < leftSubArray.length) {
			originalArray[k++] = leftSubArray[i++];	
		}
		while(j < rightSubArray.length) {
			originalArray[k++] = rightSubArray[j++];
		}
		
	}

}
