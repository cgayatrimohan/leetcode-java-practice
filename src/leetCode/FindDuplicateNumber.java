package leetCode;

import java.util.*;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
		if(nums == null || nums.length <= 1) return 0;
		
		Set<Integer> unique = new HashSet<>();
		
		for(int x : nums) {
			if(unique.contains(x)) {
				return x;
			}
			unique.add(x);
		}
		
		return 1;
	}
}
