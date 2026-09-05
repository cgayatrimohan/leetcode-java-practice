package leetCode;

import java.util.*;
/**
 * Given an integer array nums, find all the numbers x in nums that satisfy the following: 
 * x + 1 is not in nums, and x - 1 is not in nums.

If a valid number x appears multiple times, you only need to include it in the answer once.
 */
public class FindDesiredNumber {

	public static List<Integer> findNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		Set<Integer> numSet = new HashSet<>();
		
		for(int num : nums) {
			numSet.add(num);
		}
		
		for(int num : nums) {
			if(!numSet.contains(num+1) && numSet.contains(num - 1)) {
				result.add(num);
			}
		}
		return result;
	}
}
