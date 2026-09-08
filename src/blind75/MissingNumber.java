package blind75;

import java.util.*;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(findMissingNumber(nums));
	}

	private static int findMissingNumber(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		
		int expectedCount = nums.length + 1;
		
		for(int num : nums) {
			numSet.add(num);
		}
		
		for(int i = 0; i < expectedCount; i++) {
			if(!numSet.contains(i)) {
				return i;
			}
			
		}		
		return -1;
	}
}
