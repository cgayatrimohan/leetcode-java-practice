package coddy;

public class Palindrome {

	public static void main(String[] args) {
		int num = 676;
		System.out.print("Is the number palindrome: " + isNumPalindrome(num));
		
		System.out.println("\n");
		
		String s = "racecar";
		System.out.print("Is the string palindrome: " + isPalindrome(s));

	}

	/**
	 * If a string is palindrome
	 */
	public static boolean isPalindrome(String s) {
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
	
	/**
	 * if a number is palindrome
	 */
	public static boolean isNumPalindrome(int num) {
		int original = num;
		int reversed = 0;
		
		for(int i = 0; i < num; i++) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		return original == reversed;
	}
}
