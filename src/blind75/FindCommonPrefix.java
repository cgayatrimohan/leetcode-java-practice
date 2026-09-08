package blind75;

import java.util.Arrays;

public class FindCommonPrefix {

	public static void main(String[] args) {
		String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
		System.out.println(longestCommonPrefix(arr));
	}

	private static String longestCommonPrefix(String[] arr) {
		Arrays.sort(arr); // sort the array of Strings
		
		//get first and last strings after sorting
		String first = arr[0];
		String last = arr[arr.length - 1];
		int minLength = Math.min(first.length(), last.length());
		
		//find common prefix between first and last strings
		int i = 0;
		while (i < minLength && first.charAt(i) == last.charAt(i)) {
			i++;
		}
		
		// return the common prefix
		return first.substring(0, i);
	}
}
