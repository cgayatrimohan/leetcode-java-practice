package leetCode;

/**
 * Maximum Average Subarray I
 * 
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has 
 * the maximum average value and return this value. 
 */
public class MaximumAverageSubarray {

	public static void main(String[] args) {
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		
		double maxAvg = findMaxAverage(nums, k);
		System.out.println(maxAvg);
	}
	
	public static double findMaxAverage(int[] nums, int k) {
		int curr = 0;
		
		//First window
		for(int i = 0; i < k; i++) {
			curr += nums[i];
		}
		
		int ans = curr;
		
		//Slide the window
		for(int i = k; i < nums.length; i++) {
			curr += nums[i]; // add new element
			curr -= nums[i - k]; // remove old element
			
			ans = Math.max(ans, curr);
		}
		
		return (double) ans / k ;
	}
}
