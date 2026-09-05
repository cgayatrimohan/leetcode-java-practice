package leetCode;

import java.util.*;

/**
 * 1456. Maximum Number of Vowels in a Substring of Given Length
 */
public class MaxVowels {

	public static int findMaxVowels(String s, int k) {
		Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		
		int count = 0;
		
		for(int i = 0; i < k; i++) {
			if(vowels.contains(s.charAt(i))) {
				count++;
			}
		}
		
		int max = count;
		
		for(int i = k; i < s.length(); i++) {
			if(vowels.contains(s.charAt(i - k))) {
				count--;
			} 
			
			if(vowels.contains(s.charAt(i))) {
				count++;
			}
			
			if(count > max) {
				max = count;
			}
		}
		
		return max;
	}
}
