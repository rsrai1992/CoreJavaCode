package com.coding;

public class NoOfSubArraySum {
	//find  number of sub-array having sum is given number.
	
	public static int countSumSubArry(int arr[], int num) {
		int sum = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				sum = sum + arr[j];
				System.out.println("i : "+i+" j : "+j+" sum : "+sum+" count : "+count);
				if(sum == num) {
					count++;
					break;
				}
				if(sum>num)
					break;		
			}
			sum = 0;
		}
		return count;
	}

	public static void main(String[] args) {
		int a[]= {10, 2, -2, -20, 10};
		int result = countSumSubArry(a,-10);
		System.out.println("Count of Sub-Array :"+result);

	}

}
