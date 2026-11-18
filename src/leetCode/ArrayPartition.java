package leetCode;

import java.util.Arrays;
/**
 * 561: Array Partition
 * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., 
 * (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 */
public class ArrayPartition {

	private static int arrayPairSum(int[] nums) {
		int maxSum = 0;
		Arrays.sort(nums);	
		
		for(int i = 0; i < nums.length; i += 2) {
			maxSum += nums[i];
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,4,3,2};
		
		System.out.println(arrayPairSum(nums));
	}

}
