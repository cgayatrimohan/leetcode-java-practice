package leetCode;

public class UnderstandingBigO {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		int maxNum = findLargest(nums);
		System.out.println("The largest number in the provided array: " + maxNum);
	}

	private static int findLargest(int[] nums) {
		int maxNum = 0;
		
		for(int i : nums) {
			if(i > maxNum) {
				maxNum = i;
			}
		} 
		return maxNum;
	}
}
