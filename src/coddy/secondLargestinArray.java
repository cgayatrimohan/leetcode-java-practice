package coddy;

public class secondLargestinArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		System.out.println(findSecondLargest(nums));

	}

	public static int findSecondLargest(int[] nums) {
		if (nums.length < 2 || nums == null) {
			throw new IllegalArgumentException("Array must contain at least one element");
		}

		int largest = 0;
		int secondLargest = 0;

		for (int num : nums) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num != largest && num > secondLargest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}

}