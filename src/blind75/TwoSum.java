package blind75;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = findTwoSum(nums, target);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i] + ",");
		}
		
	}

	private static int[] findTwoSum(int[] nums, int target) {
		if(nums.length == 0) {
			return new int[] {};
		}
		
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}
}
