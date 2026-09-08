package blind75;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String s = "test";
		System.out.println(reverse(s));
	}
	
	private static String reverse(String s) {
		int left = 0;
		int right = s.length() - 1;
		char[] c = s.toCharArray();
		
		while(left < right) {
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			
			left++;
			right--;
		}
		return Arrays.toString(c);
	}

}
