package coddy;

public class MinimumValueInArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(minValue(nums));

	}

	public static int minValue(int[] nums) {
		if(nums.length == 0) return 1;
		
		int min = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}
}
