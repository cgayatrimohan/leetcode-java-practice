package blind75;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of rows: ");
		int rows = scanner.nextInt();
		
		printPattern(rows);
		printCharacter(rows);
	}
	
	private static void printPattern(int rows) {
		
		for(int i = 1; i <= rows; i++) {
			int whiteSpaces = rows - i;
			
			printString(" ", whiteSpaces);
			
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println("");
		}
	}
	
	private static void printCharacter(int rows) {
		
		for(int i = 1; i <= rows; i++) {
			//White spaces infront of the characters
			int numWhiteSpaces = rows - i;
			
			//print leading white spaces
			printString(" ", numWhiteSpaces);
			
			//print characters
			printCharacter("*", i);
			
			// move to next line
			System.out.println("");
		}
	}
	
	private static void printString(String s, int times) {
		for(int j = 0; j < times; j++) {
			System.out.print(s);
		}
	}

	private static void printCharacter(String s, int times) {
		for(int j = 0; j < times; j++) {
			System.out.print(s);
		}
	}
}
