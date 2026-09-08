package blind75;

import java.util.*;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = {100, 4, 200, 1, 3, 2, 5};
		System.out.println("Longest consecutive sequence = " + longestConsecutive(nums));

	}
	
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums) {
            numSet.add(num);
        }

        int longestLength = 0;

        for(int num : numSet) {
            if(!numSet.contains(num-1)) {
                int currentNum = num;
                int currentLength = 1;

                while(numSet.contains(currentNum + 1)) {
                    currentNum = currentNum + 1;
                    currentLength = currentLength + 1;
                }
                longestLength = Math.max(longestLength, currentLength);
            }
        }
        return longestLength;
    }

}
