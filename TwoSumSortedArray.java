package leetCode;

public class TwoSumSortedArray {

	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 6, 8, 9, 14, 15};
		int target = 13;
		
		boolean result = checkForTarget(nums, target);
		
		System.out.print(result);

	}

	/**
	 * If return type is an BOOLEAN then use this method
	 * 
	 * @param numbers
	 * @param target
	 * @return int[]
	 */
	private static boolean checkForTarget(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		
		while(left < right) {
			int curr = nums[left] + nums[right];
			if(curr == target) {
				return true;
			}
			
			if(curr > target) {
				right--;
			} else {
				left++;
			}
		}
		return false;
	}

	/**
	 * If return type is an array then use this method
	 * 
	 * @param numbers
	 * @param target
	 * @return int[]
	 */
	@SuppressWarnings("unused")
	private static int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;
		
		while(left < right) {
			int curr = numbers[left] + numbers[right];
			if(curr == target) {
				return new int[] {left, right};
			}
			
			if(curr > target) {
				right--;
			} else {
				left++;
			}
		}
		return new int[] {};
	}
}
