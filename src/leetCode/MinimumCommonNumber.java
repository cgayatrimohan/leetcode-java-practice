package leetCode;

import java.util.*;
/**
 * 2540. Minimum Common Value
 */
public class MinimumCommonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Two pointer approach
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static int findMinimum(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;
		
		while(i < nums1.length && j < nums2.length) {
			if(nums1[i] < nums2[j]) {
				i++;
			} else if(nums1[i] > nums2[j]) {
				j++;
			} else {
				return nums1[i];
			}
		}
		return -1;
	}

	/**
	 * Using collections
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static int minCommonNumber(int[] nums1, int[] nums2) {
		Set<Integer> numSet = new HashSet<>();
		
		for(int i : nums1) {
			numSet.add(i);
		}
		
		for(int i : nums2) {
			if(numSet.contains(i)) {
				return i;
			}
		}
		return -1;
	}
}
