package leetCode;
/**
 * 7. Reverse Integer
 */
public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234;
		System.out.println(reverseNumber(num));

	}
	
	private static int reverseNumber(int num) {
		int revNum = 0;
		
		while (num != 0) {
			int pop = num % 10;
			num = num / 10;
			
			if(revNum > Integer.MAX_VALUE/10 || (revNum == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			
			if(revNum < Integer.MIN_VALUE/10 || (revNum == Integer.MIN_VALUE /10 && pop < -8))
				return 0;
			
			revNum = (revNum * 10) + pop;
			
		}
		return revNum;
	}

}
