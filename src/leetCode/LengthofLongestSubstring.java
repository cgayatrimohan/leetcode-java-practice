package leetCode;

import java.util.*;

public class LengthofLongestSubstring {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(findLength(s));

	}

	public static int findLength(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int left = 0;
		int maxLen = 0;
		
		for(int right = 0; right < s.length() - 1; right++) {
			char c = s.charAt(right);
			
			if(map.containsKey(c)) {
				left = Math.max(left, map.get(c) + 1);
			}
			map.put(c, right);
			maxLen = Math.max(maxLen, right - left + 1);
		}
		return maxLen;
	}
}
