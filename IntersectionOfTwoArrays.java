package leetCode;

import java.util.*;

public class IntersectionOfTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i = 0;
		int j = 0;

		Set<Integer> intersection = new HashSet<>();

		while(i < nums1.length && j < nums2.length) {
			if(nums1[i] == nums2[j]) {
				intersection.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}

		int size = intersection.size();
		int[] resultArray = new int[size];
		int curr = 0;

		for(int x : intersection) {
			resultArray[curr++] = x;
		}

		return resultArray;
	}
}
