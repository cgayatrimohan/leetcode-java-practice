package blind75;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a = "test";
		String b = "tset";
		
		System.out.println(isAnagram(a, b));

	}

	private static boolean isAnagram(String a, String b) {
		char[] s1 = a.toCharArray();
		char[] s2 = b.toCharArray();
		
		if(s1.length != s2.length) {
			return false;
		}
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for(int i = 0; i < s1.length; i++) {
			if(s1[i] != s2[i]) {
				return false;
			}
		}
		return true;
	}
}
