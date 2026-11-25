package leetCode;

import java.util.*;
/**
 * 387. First Unique Character in a String [or] first non-repeating character
 * 
 * explanation: The character 'v' at index 2 is the first character 
 * that does not occur at any other index.
 */
public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));

	}

	private static int firstUniqChar(String s) {
		if(s == null || s.isEmpty()) return 0;

		Map<Character, Integer> counts = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			counts.put(c, counts.getOrDefault(c, 0)+1);
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(counts.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}
