package leetCode;

import java.util.*;

public class Panagram {

	public static boolean checkIfPanagram(String sentence) {
		
		Set<Character> charSet = new HashSet<>();
		
		for(char c : sentence.toCharArray()) {
			charSet.add(c);
		}
		
		return charSet.size() == 26;
	}
}
