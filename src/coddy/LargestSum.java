package coddy;
/**
 * Write a function named sum that given three natural numbers A, B, C from input. 
 * Return the largest sum possible with replacing one number with its square.
 */
public class LargestSum {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 5;
		int num3 = 5;
		
		System.out.println(findLargestSum(num1, num2, num3));

	}

	public static int findLargestSum(int num1, int num2, int num3) {
		int option1 = num1 * num1 + num2 + num3;
		int option2 = num1 + num2 * num2 + num3;
		int option3 = num1 + num2 + num3 * num3;
		
		return Math.max(option1, Math.max(option2,  option3));
	}
}
