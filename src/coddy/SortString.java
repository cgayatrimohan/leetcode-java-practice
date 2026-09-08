package coddy;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(sortString(s));

	}

	public static String sortString(String word) {
		if(word == null || word.isEmpty()) return word;
		
		char[] c = word.toCharArray();
		Arrays.sort(c);
		
		return new String(c);
	}
}
