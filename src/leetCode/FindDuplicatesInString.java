package leetCode;

import java.util.*;

public class FindDuplicatesInString {

	public static void main(String[] args) {
		String s = "malayalam";
		findDuplicates(s);

	}

	private static void findDuplicates(String s) {
		if(s == null || s.isEmpty()) return;
		
		Map<Character, Integer> counts = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			counts.put(c, counts.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry : counts.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
}
