package coddy;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		if(month == 2) {
			System.out.println(28);
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(30);
		} else {
			System.out.println(31);
		}
		
		scanner.close();
	}
}
