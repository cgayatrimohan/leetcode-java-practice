package leetCode;

/**
 * 1295. Find Numbers with Even Number of Digits
 */
public class NumbersWithEvenDigits {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));

	}
	
	private static int findNumbers(int[] nums) {
		int evenDigitsCount = 0;
		
		for(int num : nums) {
			if(hasEvenDigits(num)) {
				evenDigitsCount++;
			}
		}
		return evenDigitsCount;
	}
	
	private static boolean hasEvenDigits(int num) {
		int digits = 0;
		
		while(num != 0) {
			digits++;
			num /= 10;
		}
		
		return digits % 2 == 0;
		
	}

	
}
