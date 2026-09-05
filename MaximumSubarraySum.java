package leetCode;
/**
 * 53. Maximum Subarray
 */
public class MaximumSubarraySum {

	/**
	 * Algorithm

    Initialize 2 integer variables. Set both of them equal to the first value in the array.
        currentSubarray will keep the running count of the current subarray we are focusing on.
        maxSubarray will be our final return value. Continuously update it whenever we find a bigger subarray.

    Iterate through the array, starting with the 2nd element (as we used the first element to initialize our variables). For each number, add it to the currentSubarray we are building. If currentSubarray becomes negative, we know it isn't worth keeping, so throw it away. Remember to update maxSubarray every time we find a new maximum.

    Return maxSubarray.

	 * @param nums
	 * @return
	 */
	public int maxSubarray(int[] nums) {
		int currentSubarray = nums[0];
		int maxSubarray = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			currentSubarray = Math.max(nums[i], currentSubarray + nums[i]);
			maxSubarray = Math.max(maxSubarray,  currentSubarray);
		}
		return maxSubarray;
	}
}
