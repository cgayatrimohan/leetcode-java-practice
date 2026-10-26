package leetCode;

import java.util.*;
/**
 * 560. Subarray Sum Equals K
 */
public class SubArraySumEqualK {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int k = 3;
		
		System.out.println(subArraySum(nums, k));

	}
	
	private static int subArraySum(int[] nums, int k) {
		Map<Integer, Integer> counts = new HashMap<>();
		counts.put(0, 1);
		
		int ans = 0;
		int curr = 0;
		
		for(int i = 0; i < nums.length; i++) {
			// update the prefix sum
			curr += nums[i];
			
			if(counts.containsKey(curr-k)) {
				// count matching subarrays
				ans += counts.getOrDefault(curr - k, 0);
			}
			
			// record the current prefix sum
			counts.put(curr, counts.getOrDefault(curr, 0) + 1);
		}

		return ans;
	}

}
