package blind75;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 6;
		System.out.println(isPerfectNumber(num));
	}

	private static boolean isPerfectNumber(int num) {
		int sumOfDivisors = 1;
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				sumOfDivisors = sumOfDivisors + i;
			}
		}
		return sumOfDivisors == num;
	}
}
