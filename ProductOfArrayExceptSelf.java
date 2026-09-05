package leetCode;

public class ProductOfArrayExceptSelf {

	public static int[] productExceptself(int[] nums) {
		int length = nums.length;
		
		// Final result array to be returned
		int[] result = new int[length];
		
		
		// result[i] contains the product of all the elements to the left
        // Note: for the element at index '0', there are no elements to the left,
        // so the result[0] would be 1
		result[0] = 1;
		
		
		
		for(int i = 0; i < length; i++) {
			// result[i - 1] already contains the product of elements to the left of 'i - 1'
            // Simply multiplying it with nums[i - 1] would give the product of all
            // elements to the left of index 'i'
			result[i] = result[i-1] * nums[i-1];
		}
		
        // right contains the product of all the elements to the right
        // Note: for the element at index 'length - 1', there are no elements to the right,
        // so the right would be 1
		int right = 1;
		for(int i = length - 1; i >= 0; i--) {
            // For the index 'i', Right would contain the
            // product of all elements to the right. We update Right accordingly
			result[i] = result[i] * right;
			right *= nums[i];
		}
		
		return result;
	}
}
