package coddy;
/**
 * 
 */
public class LeastCommonMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int lcm(int num1, int num2) {
		if(num1 == 0 || num2 == 0) return 0;
		
		return Math.abs(num1 * num2) / gcd(num1, num2);
	}
	
	private static int gcd(int num1, int num2) {
		while(num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}
}
