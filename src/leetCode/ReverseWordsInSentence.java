package leetCode;
/**
 * 151. Reverse Words in a String
 */
public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String s = "the sky is blue";
		String reversed = reverseWords(s);
		System.out.println(reversed);
	}

	private static String reverseWords(String s) {
		String[] words = s.trim().split(" ");
		StringBuilder result = new StringBuilder();
		
		// Loop backwards from the last word to the first word
		for(int i = words.length - 1; i >= 0; i--) {
			result.append(words[i]);
			
			// Add a space between words, but not after the very last one
			if(i > 0) {
				result.append(" ");
			}
		}
		return result.toString();
	}
}
