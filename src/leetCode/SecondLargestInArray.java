package leetCode;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int[] nums = {1,4,5,2,8};
		
		System.out.println(findSecondLargest(nums));

	}
	
	private static int findSecondLargest(int[] nums) {
		int largest = 0;
		int secondLargest = 0;
		
		if(nums == null || nums.length < 2) {
			throw new IllegalArgumentException("Array must contain at least one element");
		}
		
		for(int num : nums) {
			if(num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest || num == largest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}

}
