package leetCode;

import java.util.*;
/**
 * Missing Number
 * 
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 */
public class MissingInteger {

	public static int missingInteger(int[] nums) {
		int count = nums.length + 1;
		Set<Integer> numSet = new HashSet<>();
		
		for(int x : nums) {
			numSet.add(x);
		}
		
		for(int i = 0 ; i < count; i++) {
			if(!numSet.contains(i)) {
				return 1;
			}
		}
		return -1;
	}
}
