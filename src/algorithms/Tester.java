package algorithms;

import algorithms.recursion.Recursion;
import algorithms.sorting.Sorting;

public class Tester {

	public static void main(String[] args) {
		int[] nums = {9,3,1,8,7,5,4,2,9,2};
		System.out.println("Before");
		printArray(nums);
		Sorting.mergeSort(nums);
		System.out.println("After");
		printArray(nums);
		
	}

	private static void printArray(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println(" ");
	}

}
