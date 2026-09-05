package leetCode;

import java.util.*;

/*
 * You are given a binary string s (a string containing only "0" and "1"). 
 * You may choose up to one "0" and flip it to a "1". What is the length of the longest substring achievable 
 * that contains only "1"?
For example, given s = "1101100111", the answer is 5. 
If you perform the flip at index 2, the string becomes 1111100111.
 */
public class LongestBinarySubstring {

	public static void main(String[] args) {
		String s = "1101100111";
		int length = findLength(s);
		
		System.out.printf("Length of the longest Binary substring: "+ length);
		System.out.println();
		
		String str = "eceba";
		int k = 2;
		
		System.out.println("Length of longest substring is " +longestSubstring(str, k));
	}
	
	public static int findLength(String s) {
		int curr = 0; // count of how many '0' in window
		int left = 0;
		int ans = 0;
		
		for(int right = 0; right < s.length(); right++) {
			if(s.charAt(right) == '0') {
				curr++;
			}
			
			while(curr > 1) {
				if(s.charAt(left) == '0') {
					curr--;
				}
				left++;
			}
			ans = Math.max(ans, right - left + 1);
		}
		return ans;
	}
	
	public static int longestSubstring(String s, int k) {
	    Map<Character, Integer> counts = new HashMap<>();
	    int left = 0;
	    int ans = 0;

	    for (int right = 0; right < s.length(); right++) {
	        char c = s.charAt(right);
	        counts.put(c, counts.getOrDefault(c, 0) + 1);
	        while (counts.size() > k) {
	            char remove = s.charAt(left);
	            counts.put(remove, counts.getOrDefault(remove, 0) - 1);
	            if (counts.get(remove) == 0) {
	                counts.remove(remove);
	            }

	            left++;
	        }

	        ans = Math.max(ans, right - left + 1);
	    }

	    return ans;
	}
}
