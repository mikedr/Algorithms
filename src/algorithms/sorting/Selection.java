package algorithms.sorting;

public class Selection {

	public static int[] sort(int[] nums) {
		int aux;
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i]>nums[j]) {
					aux = nums[j];
					nums[j] = nums[i];
					nums[i] = aux;
				}
			}
		}
		return nums;
	}

}
