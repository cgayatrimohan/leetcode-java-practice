package leetCode;

public class SubarrayProductLessThanK {

	public static void main(String[] args) {
		int[] nums = {10,5,2,6};
		int k = 100;
		
		int result = numSubArrayProductLessThanK(nums, k);
		System.out.println(result);

	}
	
	public static int numSubArrayProductLessThanK(int[] nums, int k) {
		int curr = 1;
		int left = 0;
		int ans = 0;
		
		for(int right = 0; right < nums.length - 1; right++) {
			curr *= nums[right];
			
			while(curr > k) {
				curr *= nums[left];
				left++;
			}
			ans += right - left + 1;
		}
		return ans;
	}

}
