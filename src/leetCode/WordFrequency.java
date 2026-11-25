package leetCode;

import java.util.*;
/**
 * Find the frequency of each word - HashMap
 */
public class WordFrequency {

	public static void main(String[] args) {
		String s = "Java is fun and Java is powerful";
		
		String[] words = s.toLowerCase().split("\\s+");
		Map<String, Integer> frequencies = new HashMap<>();
		
		for(String word : words) {
			frequencies.put(word, frequencies.getOrDefault(word, 0) + 1);
		}

//		for(Map.Entry<String, Integer> entry : frequencies.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
		System.out.println(frequencies);
	}
}
