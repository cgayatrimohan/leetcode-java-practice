package leetCode;

public class WaysToSplitArray {

	public int splitArray(int[] nums) {
		long totalSum = 0;
        for (int num : nums) {
            totalSum += num; // Calculate total sum of the array
        }

        long leftSection = 0;
        int ans = 0;

        // Iterate up to n - 1 because there must be at least one element on the right
        for (int i = 0; i < nums.length - 1; i++) {
            leftSection += nums[i];
            long rightSection = totalSum - leftSection;

            if (leftSection >= rightSection) {
                ans++;
            }
        }
        return ans;
	}
}
