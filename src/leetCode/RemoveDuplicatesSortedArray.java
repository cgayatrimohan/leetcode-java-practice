package leetCode;

/**
 * 26. Remove Duplicates from Sorted Array
 * Algorithm

	By analyzing the above three key observations, we can derive the following algorithm,
    
    Start both indexes (insertIndex, i) from 1.
		insertIndex and i represents our First and second Index respectively.

    Check if the previous element is different from the current element
		The previous element is the element just before our i index i.e element present at arr[i-1]

    If found different then perform arr[insertIndex] = arr[i] and increment insertIndex by 1
		Increment i index by 1 till we reach end of the array

    Note: After reaching the end of the array, our insertIndex variable will hold the count of unique elements in our input array.


 */
public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,2,3,3,4,4};
		
		System.out.println(removeDuplicates(nums));

	}

	public static int removeDuplicates(int[] nums) {
		int insertIndex = 1;
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i-1] != nums[i]) {
				nums[insertIndex] = nums[i];
				insertIndex++;
			}
		}
		return insertIndex;
	}
}
