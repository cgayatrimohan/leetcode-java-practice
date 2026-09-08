package leetCode;

public class MoveZerosInArray {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		int[] result = moveZerosToEnd(nums);
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	private static int[] moveZerosToEnd(int[] nums) {
		int left = 0;


		for(int right = 0; right < nums.length; right++) {
			if(nums[right] != 0) {
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left] = temp;
				left++;
			}
		}
		return nums;
	}

}
