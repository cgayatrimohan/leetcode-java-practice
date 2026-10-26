package leetCode;

import java.util.*;
/**
 * 1248. Count Number of Nice Subarrays

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
            if(counts.containsKey(curr-k)) {
            	// find subarrays with sum k
            	ans += counts.getOrDefault(curr - k, 0);
            }
            // record the current prefix sum
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }
        
        return ans;
	}
}
