
package leetCode;

/**
 * 1796. Second Largest Digit in a String
 */
public class SecondLargestDigitInString {

	private static int findSecondLargest(String s) {
		int largest = -1;
		int secondLargest = -1;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (ch >= '0' && ch <= '9') {
				int num = (ch - '0');
				
				if (num > largest) {
					secondLargest = largest;
					largest = num;
				} else if (num > secondLargest && num < largest) {
					secondLargest = num;
				}
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		String s = "dfa1232458888decwewt76271afd";
		System.out.println(findSecondLargest(s));
	}
}
