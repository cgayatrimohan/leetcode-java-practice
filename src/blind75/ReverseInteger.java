package blind75;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = -1234;
		System.out.println(findReverse(num));

	}

	private static int findReverse(int num) {
		int rev = 0;
		int rem = 0;
		
		while(num != 0) {
			rem = num % 10;
			num = num / 10;
			if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE /10) && rem > 7) return 0;
			if(rev > Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE /10) && rem < -8) return 0;
			
			rev = rev*10 + rem;
			
		}
		return rev;
	}
}
