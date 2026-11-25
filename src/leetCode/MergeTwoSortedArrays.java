package leetCode;

import java.util.*;

public class MergeTwoSortedArrays {

	public List<Integer> merge(int[] nums1, int[] nums2) {
		List<Integer> result = new ArrayList<>();

		int i = 0;
		int j = 0;

		while(i < nums1.length && j < nums2.length) {
			if(nums1[i] < nums2[j]) {
				result.add(nums1[i]);
				i++;
			} else {
				result.add(nums2[j]);
				j++;
			}

			while(i < nums1.length) {
				result.add(nums1[i]);
				i++;
			}

			while(j < nums2.length) {
				result.add(nums2[j]);
				j++;
			}

		}
		return result;
	}
	
	/**
	 * 88. Merge Sorted Array
	 */
    @SuppressWarnings("unused")
	private void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
