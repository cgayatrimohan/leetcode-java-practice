package leetCode;
/**
 * 3936. Minimum Swaps to Move Zeros to End
 */
public class MinimumSwaps {

	/**
	 * Approach

    First initalize l and r respectively as 0 and last index of nums
    Then find the first non zero index from last
    Find the first zero appearing from front
    Swap them and count the swap , since the non zero number is now zero move towards left
    Exit loop when left crosses right

	 * @param nums
	 * @return
	 */
	public int findMinSwaps(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int count = 0;
		
		while(left < right) {
			if(nums[right] == 0) {
				right--;
				continue;
			}
			
			if(nums[left] == 0) {
				nums[left] = nums[right];
				nums[right] = 0;
				count++;
				right--;
			}
			left++;
		}
		return count;
	}
}
