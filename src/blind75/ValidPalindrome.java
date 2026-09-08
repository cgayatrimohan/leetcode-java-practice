package blind75;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		
		while(left < right) {
			while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			if(Character.isLowerCase(s.charAt(left)) != Character.isLowerCase(s.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		
		
		return true;
	}

}
