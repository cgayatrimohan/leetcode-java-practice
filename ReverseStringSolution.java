package leetCode;

import java.util.Arrays;

public class ReverseStringSolution {

	public static void main(String[] args) {
		String s = "hello";
		reverse(s);
	}
	
	public static void reverse(String s) {
		char[] c = s.toCharArray();
		
		int left = 0;
		int right = s.length() - 1;
		
		while(left < right) {
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;

			left++;
			right--;
		}
		
		System.out.print("Reverse String = " + Arrays.toString(c));
	}
	
	/**
	 * If the parameter is an array
	 * @param s
	 */
    public void reverseString(char[] s) {
        
        int left = 0;
        int right = s.length - 1;
        
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
        System.out.print("Reverse String = " + Arrays.toString(s));
    }
    
    /**
     * Reverse String without using any arrays 
     * 
     */
    public static String reverseStringWithoutArrays(String input) {
    	StringBuilder reverse = new StringBuilder();
    	
    	for(int i = input.length() - 1; i >= 0; i--) {
    		reverse.append(input.charAt(i));
    	}
    	
    	return reverse.toString();
    }
}
