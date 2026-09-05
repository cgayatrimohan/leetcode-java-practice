package leetCode;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String rev = reverseString(s);
		
		System.out.println(rev);
	}
	
	public static String reverseString(String str) {
		//Split the input string into words and reverse each word
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		for(String word : words) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			result.append(reversedWord).append(" ");
		}
		result.deleteCharAt(result.length() - 1); // remove the extra space at the end

		return result.toString();
	}
}
