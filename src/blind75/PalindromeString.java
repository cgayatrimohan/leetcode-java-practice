package blind75;

public class PalindromeString {

	public static void main(String[] args) {
//		String s = "Palindrome";
		String x = "Malayalam";
		System.out.println(isPalindrome(x));

	}

	private static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
