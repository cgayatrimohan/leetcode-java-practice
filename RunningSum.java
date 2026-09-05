package leetCode;

public class RunningSum {

	public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = sum(nums);

        for(int i = 0; i < result.length; i++) {
        	System.out.print(result[i] + " ");
        }
        
    }

    public static int[] sum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

}
