package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUnsorted {

	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 6, 8, 9, 14, 15};
		int target = 13;
		int[] result = twoSum(nums, target);

		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[]{i,j};
				}
			}
		}
		return new int[] {};
	}
	
	public static int[] twoSumUsingHashMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
		}
		return new int[] {};
	}
}
