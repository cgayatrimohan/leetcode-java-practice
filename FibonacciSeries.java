package leetCode;

/**
 * Recursion
 */

public class FibonacciSeries {

	public static void main(String[] args) {
		int terms = 10; // Number of elements to print
		System.out.println("Fibonacci Series up to " + terms + " terms:");

		// Loop to print each number in the sequence
		for (int i = 0; i < terms; i++) {
			System.out.print(getFibonacci(i) + " ");
		}
	}

	// Recursive method to calculate the nth Fibonacci number
	public static int getFibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}

	@SuppressWarnings("unused")
	private static void fibonacciWithoutRecursion(int count) {
		if(count <= 1) System.out.println("Invalid input");
		
		int a = 0;
		int b = 1;
		int c = 1;
		
		for(int i = 0; i <= count; i++) {
			System.out.println(a + "," + " ");
			a = b;
			b = c;
			c = a+b;
		}
	}
}


