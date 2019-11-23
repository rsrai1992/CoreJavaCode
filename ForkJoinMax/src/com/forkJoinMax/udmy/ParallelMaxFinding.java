package com.forkJoinMax.udmy;

import java.util.concurrent.RecursiveTask;

public class ParallelMaxFinding extends RecursiveTask<Integer> {

	private int[] nums;
	private int lowIndex;
	private int highIndex;

	public ParallelMaxFinding(int[] nums, int lowIndex, int highIndex) {
		this.nums = nums;
		this.lowIndex = lowIndex;
		this.highIndex = highIndex;
	}

	@Override
	protected Integer compute() {
		if(highIndex - lowIndex < App.THRESHOLD) {
			return sequentialMaxFind();
		}else {
			int middleIndex = (lowIndex+highIndex)/2;
			ParallelMaxFinding task1 = new ParallelMaxFinding(nums, lowIndex, middleIndex);
			ParallelMaxFinding task2 = new ParallelMaxFinding(nums, middleIndex, highIndex);
			
			invokeAll(task1,task2);
			return Math.max(task1.join(), task2.join());
		}
	}

	private int sequentialMaxFind() {

		int max = nums[lowIndex];
		for (int i = lowIndex+1; i < highIndex; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}

		}
		return max;
	}

}
