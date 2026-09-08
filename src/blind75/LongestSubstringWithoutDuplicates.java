package blind75;

import java.util.*;

public class LongestSubstringWithoutDuplicates {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println("Length of the longest sub string = " + lengthOfLongestSubstring(s));	

	}

	private static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		
		int left = 0;
		int maxLength = 0;
		
		for(int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			
			if(map.containsKey(c)) {
				left = Math.max(left,  map.get(c)+1);
			}
			
			map.put(c, right);
			maxLength = Math.max(maxLength, right-left+1);
		}
		return maxLength;
	}
}
