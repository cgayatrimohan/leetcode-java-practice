package blind75;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 1211;
		System.out.println(isPalindromeNumber(x));
	}

//	private static boolean isPalindrome(int num) {
//		String s = String.valueOf(num);
//		
//		int right = s.length() - 1;
//		
//		for(int left = 0; left < right; left++, right--) {
//			if(s.charAt(left) != s.charAt(right)) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	private static boolean isPalindromeNumber(int x) {
		String s = String.valueOf(x);
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
