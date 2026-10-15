package leetCode;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "racecar";
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;		
	}
}
