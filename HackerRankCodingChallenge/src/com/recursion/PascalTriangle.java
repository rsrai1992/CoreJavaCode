package com.recursion;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		
		ArrayList<ArrayList<Integer>> l1 = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <numRows; i++) {
			ArrayList<Integer> l = new ArrayList<Integer>(numRows);
			for (int j = 0; j <= i; j++) {
				//System.out.println("i:"+i+" j:"+j+" pascal_value :"+pascal(i, j));
				l.add(pascal(i, j));
			}
			l1.add(l);
		}
		return l1;
	}

	public int pascal(int i, int j) {
		if (j == 0) {
			return 1;
		} else if (j == i) {
			return 1;
		} else {
			return pascal(i - 1, j - 1) + pascal(i - 1, j);
		}

	}
}

public class PascalTriangle {

	public static void main(String[] args) {
		Solution s = new Solution();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result = s.generate(5);
		System.out.println(result);
	}

}
