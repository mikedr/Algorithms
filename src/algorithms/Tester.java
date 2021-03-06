package algorithms;

import algorithms.sorting.Selection;

public class Tester {

	public static void main(String[] args) {
		int[] nums = {9,3,1,8,7,5,4,2,6};
		printArray(nums);
		int[] sorted = Selection.sort(nums);
		printArray(sorted);
	}

	private static void printArray(int[] nums) {
		System.out.println();
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}

}
