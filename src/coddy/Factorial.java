package coddy;

public class Factorial {

	public static void main(String[] args) {
		int num = 6;
		System.out.print("factorial of 6 = " + findFactorial(num));

	}

	public static int findFactorial(int num) {
		if(num == 0 || num <= 1) return num;
		
		return num * findFactorial(num - 1);
	}
}
