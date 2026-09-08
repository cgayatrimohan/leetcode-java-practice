package leetCode;

public class MinimumSubarraySum {

	public static void main(String[] args) {
		int[] nums = {2,3,1,2,4,3};
		int target = 7;
		
		System.out.println(minSubarrayLen(nums, target));
	}
	
	public static int minSubarrayLen(int[] nums, int target) {
		int left = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE; // Initialize with a representation of infinity

        // Expand the window using the right pointer
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            // Shrink the window from the left as long as the condition is met
            while (currentSum >= target) {
                // Update the minimum length found so far
                minLength = Math.min(minLength, right - left + 1);
                
                // Remove the leftmost element from the sum and move the pointer
                currentSum -= nums[left];
                left++;
            }
        }

        // If minLength was never updated, it means no valid subarray exists
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}
}
