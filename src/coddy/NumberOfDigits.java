package coddy;

public class NumberOfDigits {

	public static void main(String[] args) {
		int num = 87654;
		System.out.println(findNumberOfDigits(num));

	}

	private static int findNumberOfDigits(int num) {
		int count = 0;
		
		while(num > 0) {
			@SuppressWarnings("unused")
			int digits = num % 10;
			num /= 10;
			count++;
		}
		return count;
	}

}
