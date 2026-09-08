package coddy;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] result = rotate(arr);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		

	}

	public static int[] rotate(int[] nums) {
	    // Handle edge cases: null or arrays with 0 or 1 element don't change
	    if (nums == null || nums.length <= 1) {
	        return nums;
	    }

	    // 1. Save the very last element because it will be overwritten
	    int lastElement = nums[nums.length - 1];

	    // 2. Shift all elements to the right by 1 position, moving backwards
	    for (int i = nums.length - 1; i > 0; i--) {
	        nums[i] = nums[i - 1];
	    }

	    // 3. Move the saved last element to the very front index
	    nums[0] = lastElement;

	    return nums;
	}
}
