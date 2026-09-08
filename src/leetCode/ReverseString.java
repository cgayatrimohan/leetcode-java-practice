package leetCode;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String s = "abcde";
		String rev = findReverse(s);
		System.out.println(rev);

	}

	public static String findReverse(String s) {
		int left = 0;
		int right = s.length() - 1;
		char[] rev = s.toCharArray();
		
		while(left < right) {
			char temp = rev[left];
			rev[left] = rev[right];
			rev[right] = temp;
			
			left++;
			right--;
		}
		
		return Arrays.toString(rev);
	}
}
