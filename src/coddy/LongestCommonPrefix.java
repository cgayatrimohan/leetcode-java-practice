package coddy;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		
		System.out.println(findLongestCommonPrefix(strs));
		
	}
	public static String findLongestCommonPrefix(String[] arr) {
		if(arr == null || arr.length == 0) return "";
		
		// Sort alphabetically
		Arrays.sort(arr);
		
		//Compare the left and right strings in the sorted array
		String left = arr[0];
		String right = arr[arr.length - 1];
		int index = 0;
		
		// Find the matching characters from the beginning
		while(index < left.length() && index < right.length()) {
			if(left.charAt(index) == right.charAt(index)) {
				index++;
			} else {
				break; // stop as soon as characters dont match
			}
		}
		return left.substring(0, index);
		
	}
}
