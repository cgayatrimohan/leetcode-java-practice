package blind75;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		int[] result = findSquares(nums);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	private static int[] findSquares(int[] nums) {
		int length = nums.length;
		int[] result = new int[length];
		
		for(int i = 0; i < length; i++) {
			result[i] = nums[i] * nums[i];
		}
		
		for(int i = 0; i < result.length - 1; i++) {
			for(int j = i+1; j < result.length; j++) {
				if(result[i] > result[j]) {
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}
		return result;
	}

}
