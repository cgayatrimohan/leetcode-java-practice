package leetCode;

import java.util.*;

public class FindTheDifference {

	public static void main(String[] args) {
		String s = "aa";
		String t = "aae";
		
		System.out.println(findtheDifference(s, t));

	}

	public static char findtheDifference(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();
		char extraChar = ' ';
		
		for(int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		for(int j = 0; j < t.length(); j++) {
			char ch = t.charAt(j);
			int countOfChar = map.getOrDefault(t.charAt(j), 0);
			
			if(countOfChar == 0) {
				extraChar = ch;
			} else {
				map.put(ch, countOfChar - 1);
			}
		}
		return extraChar;
	}
}
