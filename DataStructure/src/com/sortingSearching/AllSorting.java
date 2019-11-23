package com.sortingSearching;

import java.util.Scanner;

class SortingLogic {

	public void printElement(int r[]) {
		for (int e1 : r) {
			System.out.print(e1 + " ");
		}
	}

	public int[] selectionSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;

	}

	public int[] bubbleSort(int a[]) {
		boolean swapped;
		for (int i = 0; i < a.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
		return a;
	}

	public int[] insertionSort1(int a[]) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			System.out.println("Sort Pass Number " + (i));
			int key = a[i];
			int j = i - 1;

			while ((j > -1) && (a[j] > key)) {
				System.out.println("Comparing " + key + " and " + a[j]);
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
			System.out.println("Swapping Elements: New Array After Swap");
		}
		return a;
	}

	public int[] insertionSort2(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				} else {
					break;
				}

			}

		}
		return a;
	}
	
	public int[] shellSort1(int a[]) {
		int n = a.length;
		for(int gap=n/2; gap>0; gap=gap/2) {
			for(int i=gap; i<n; i++) {
				int temp = a[i];
				int j;
				for(j=i; j>=gap&&a[j-gap]>temp; j=j-gap) {
					a[j] = a[j-gap];
				}
				a[j] = temp;
			}
			
		}
		return a;
	}
	
	public int[] shellSort2(int a[]) {
		int increment = a.length/2;
		while(increment>=1) {
			for(int startIndex =0; startIndex<increment; startIndex++) {
				for(int i=startIndex; i<a.length; i=i+increment) {
					for(int j=Math.min(i+increment, a.length-1); j-increment>=0; j=j-increment) {
						if(a[j]<a[j-increment]) {
							int temp =a[j-1];
							a[j-1] = a[j];
							a[j] = temp;	
						}else {
							break;
						}
					}
				}
			}
			increment = increment/2;
		}
		return a;
	}
	// merge sort
	public static void split(int[] listToSort, int[] firstHalf, int[] secondHalf) {
		int halfLength = listToSort.length/2;
		for(int i=0; i<listToSort.length; i++) {
			if(i<halfLength) {
				firstHalf[i] = listToSort[i];
				//System.out.println("First Half"+firstHalf[i]);
			} else {
				int j = i%halfLength;
				secondHalf[j] = listToSort[i];
				//System.out.println("Second Half"+secondHalf[j]);
			}
		}
	}
	public static void merge(int[]a, int[] firstHalve, int[] secondHalve) {
		int firstArrayIndex = 0;
		int secondArrayIndex = 0;
		int mergeIndex = 0;
		while(firstArrayIndex<firstHalve.length && secondArrayIndex<secondHalve.length) {
			if(firstHalve[firstArrayIndex]<secondHalve[secondArrayIndex]) {
				a[mergeIndex] = firstHalve[firstArrayIndex];
				firstArrayIndex++;
			}else {
				a[mergeIndex] = secondHalve[secondArrayIndex];
				secondArrayIndex++;
			}
			mergeIndex++;
		}
		if(firstArrayIndex <firstHalve.length) {
			while(mergeIndex<a.length) {
				a[mergeIndex++] = firstHalve[firstArrayIndex++];
			}
			
		}
		if(secondArrayIndex<secondHalve.length) {
			while(mergeIndex<a.length) {
				a[mergeIndex] = secondHalve[secondArrayIndex];
			}
		}
	}
	public static void mergeSort(int[] listToSort) {
		if(listToSort.length==1)
			return ;
		
		int midIndex = listToSort.length/2;
		int[] listFirstHalf = new int[midIndex];
		int[] listSecondHalf = new int[listToSort.length-midIndex];

		int halfLength = listToSort.length/2;
		for(int i=0; i<listToSort.length; i++) {
			if(i<halfLength) {
				listFirstHalf[i] = listToSort[i];
			} else {
				int j = i%halfLength;
				listSecondHalf[j] = listToSort[i];
			}
		}
        SortingLogic sl = new SortingLogic();
		
     	mergeSort(listFirstHalf);
		mergeSort(listSecondHalf);
	
     	merge(listToSort, listFirstHalf, listSecondHalf);
	}
}

public class AllSorting {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		} */
		int arr[] = {3,1,9,4,2,7,6,5,0,8};
		SortingLogic sl = new SortingLogic();
//		int result[]=sl.selectionSort(arr);
//		System.out.println("Sorted Array Using Selection Sort : ");
//		sl.printElement(result);

//		int result[] = sl.bubbleSort(arr);
//		System.out.println("Sorted Array Using Bubble Sort : ");
//		sl.printElement(result);

//		int result[] = sl.insertionSort2(arr);
//		System.out.println("Sorted Array Using Insertion Sort : ");
//		sl.printElement(result);
		
//		int result[] = sl.shellSort2(arr);
//		System.out.println("Sorted Array Using Shell Sort : ");
//		sl.printElement(result);
		
		sl.mergeSort(arr);
		System.out.println();
		System.out.println("Sorted Array Using Shell Sort : ");		
		sl.printElement(arr);
		

	}

}
