package coddy;

import java.util.Scanner;

public class MiddleDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		
		int middle = num.length() / 2;
		
		if(num.length() / 2 == 0) {
			System.out.println("No middle number, as the digits are even");
		} else {
			System.out.println(num.charAt(middle));
		}
		scanner.close();
	}

}
