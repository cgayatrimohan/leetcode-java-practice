package leetCode;

import java.util.*;
/**
 * 2351. First Letter to Appear Twice

 * Given a string s consisting of lowercase English letters, 
 * return the first letter to appear twice.
 */
public class FirstLetterToAppearTwice {

	public static char findRepeatedCharacter(String s) {
		Set<Character> seen = new HashSet<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(seen.contains(c)) {
				return c;
			}
			seen.add(c);
		}
		
		return ' ';
	}
}
