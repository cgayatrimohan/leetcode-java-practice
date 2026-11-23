package leetCode;

/**
 * 507. Perfect Number
 */
public class FindPerfectNumber {

	public static void main(String[] args) {
		int num = 496;
		System.out.println(isPerfectNumber(num));
	}
	
	private static boolean isPerfectNumber(int num) {
		if(num <= 1) {
			return false;
		}

		int sumOfDivisors = 1;
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				sumOfDivisors = sumOfDivisors + i;
			}
		}
		return sumOfDivisors == num;
	}

}
