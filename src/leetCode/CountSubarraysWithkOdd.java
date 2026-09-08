package leetCode;

import java.util.*;
/**
 * This Java method calculates the number of contiguous subarrays 
 * that contain exactly k odd numbers 
 * using the prefix sum technique with a HashMap.
 */
public class CountSubarraysWithkOdd {

	public static int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);
        
        int ans = 0;
        int curr = 0;
        
        for (int num: nums) {
            curr += num % 2;
            ans += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }
        
        return ans;
	}
}
