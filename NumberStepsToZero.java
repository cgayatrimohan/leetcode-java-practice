package leetCode;

/*
 * 1342. Number of Steps to Reduce a Number to Zero
 */
public class NumberStepsToZero {
	public static int findStepsToZero(int num) {
		int steps = 0;
		
		while( num != 0) {		
			if( num % 2 == 0) {
				num = num / 2;
			} else {
				num = num - 1;
			}
			steps = steps + 1;
		}
		
		return steps;
	}
}
