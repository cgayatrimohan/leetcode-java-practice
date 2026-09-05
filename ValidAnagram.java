package leetCode;

import java.util.*;

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();
		
		if(s.length() != t.length()) return false;
		
		for(int i = 0; i < s.length(); i++) {
			// If s and t are true anagrams, every single +1 from string s 
			// will be perfectly canceled out by a -1 from string t. 

			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
		}
		
		for(char c : map.keySet()) {
			// The final count for every single letter must be exactly 0.
			if(map.get(c) != 0) return false;
		}
		
		return true;
	}
}
