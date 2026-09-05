package leetCode;

public class MaxConsecutiveOnesIII {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3;
		int max = longestOnes(nums, k);
		
		System.out.println(max);
	}

	public static int longestOnes(int[] nums, int k) {
		int curr = 0;
		int ans = 0;
		int left = 0;
		
		for(int right = 0; right < nums.length; right++) {
			if(nums[right] == 0) {
				curr++;
			}
			
			while(curr > k) {
				if(nums[left] == 0) {
					curr--;
				}
				left++;
			}
			ans = Math.max(ans, right - left + 1);
		}
		return ans;
	}
}
