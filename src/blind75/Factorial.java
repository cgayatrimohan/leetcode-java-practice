package blind75;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(findFactorial(num));

	}

	private static int findFactorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		
		return num * findFactorial(num - 1);
	}
}
