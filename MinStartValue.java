package leetCode;
/**
 * Minimum Value to Get Positive Step by Step Sum
 * 
 * Given an array of integers nums, you start with an initial positive value startValue.
   In each iteration, you calculate the step by step sum of startValue plus elements 
   in nums (from left to right).
   Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 */
public class MinStartValue {

	public static void main(String[] args) {
		int[] nums = {-3,2,-3,4,2};
		int result = minstartValue(nums);
		
		System.out.println(result);

	}
	public static int minstartValue(int[] nums) {
		// Start with startValue = 1. 
        int startValue = 1;

        // While we haven't found the first valid startValue
        while (true) {
            // The step-by-step total equals startValue at the beginning.
            // Use boolean parameter "isValid" to record whether the total 
            // is larger than or equal to 1.
            int total = startValue;
            boolean isValid = true;

            // Iterate over the array "nums".
            for (int num : nums) {
                // In each iteration, calculate "total" 
                // plus the element "num" in the array.
                total += num;

                // If "total" is less than 1, we shall try a larger startValue,
                // we mark "isValid" as "false" and break the current iteration.
                if (total < 1) {
                    isValid = false;
                    break;
                }
            }

            // If "isVaild" is true, meaning "total" is never less than 1 in the
            // iteration, therefore we return this "startValue". Otherwise, we 
            // go ahead and try "startValue" + 1 as the new "startValue". 
            if (isValid) {
                return startValue;
            } else {
                startValue += 1;
            }
        }
	}
}
