package blind75;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		String s = "babad";
		System.out.println(findLongestPalindromicSubstring(s));
	}
	
	private static String findLongestPalindromicSubstring(String s) {
		for(int length = s.length(); length > 0; length--) {
			for(int start = 0; start <= s.length() - length; start++) {
				if(isPalindrome(start, start+length, s)) {
					return s.substring(start, start+length);
				}
			}
		}
		return "";
	}
	
	private static boolean isPalindrome(int i, int j, String s) {
		int left = i;
		int right = j - 1;
		
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
