package leetCode;

import java.util.Stack;

/**
 * 917. Reverse Only Letters
 */
public class ReverseLetters {

	public static String reverseOnlyLetters(String s) {
		Stack<Character> letters = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(Character.isLetter(c)) {
				letters.push(c);
			}	
		}
		
		StringBuilder reverse = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			if(Character.isLetter(c)) {
				reverse.append(letters.pop());
			} else {
				reverse.append(c);
			}
		}
		return reverse.toString();
	}
}
