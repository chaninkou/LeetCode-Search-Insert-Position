package leetcode35;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		
		int target = 7;
		
		System.out.println("Input: " + Arrays.toString(nums) + " target: " + target);
		
		FindInsertPosition solution = new FindInsertPosition();
		
		System.out.println("Solution: " + solution.searchInsert(nums, target));
	}
}
