package leetCode;

public class PalindromeNumber {

	public boolean isPalindrome(int num) {
		String s = String.valueOf(num);
		
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
