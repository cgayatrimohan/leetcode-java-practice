package leetCode;

import java.util.*;
/**
 * 1941. Check if All Characters Have Equal Number of Occurrences
 */
public class CheckCharacterOccurences {

	public static boolean areOccurencesEqual(String s) {
		Map<Character, Integer> counts = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			counts.put(c, counts.getOrDefault(c, 0)+1);
		}
		
		//If all characters appeared the exact same number of times, every single frequency number would be identical. 
		//The HashSet would squash them all down into a single number. 
		//Therefore, if frequencies.size() == 1, it means every letter has the same count, 
		//and it returns true. Otherwise, it returns false.
		Set<Integer> frequencies = new HashSet<>(counts.values());
		return frequencies.size() == 1;
	}
}
