package leetCode;

import java.util.*;

public class TwoSum {
	
	public int[] findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i <nums.length; i++) {
			int need = target - nums[i];
			if(map.containsKey(need)) {
				return new int[] {map.get(need), i};
			}
			map.put(nums[i], i);
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		TwoSum solution = new TwoSum();

		int[] nums1 = {2, 7, 11, 15};
		int target1 = 9;
		System.out.println(Arrays.toString(solution.findTwoSum(nums1, target1))); // [0, 1]

		int[] nums2 = {3, 2, 4};
		int target2 = 6;
		System.out.println(Arrays.toString(solution.findTwoSum(nums2, target2))); // [1, 2]

		int[] nums3 = {3, 3};
		int target3 = 6;
		System.out.println(Arrays.toString(solution.findTwoSum(nums3, target3))); // [0, 1]
	}
}
