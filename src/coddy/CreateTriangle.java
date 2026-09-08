package coddy;

import java.util.Scanner;

/**
 * Write a program that gets three natural numbers A, B, C from input and outputs 
 * whether a triangle can be made with sides that have lengths A, B and C. 
 * If yes outputs "YES", otherwise, outputs "NO"
 */
public class CreateTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if(num1+num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
		scanner.close();

	}

}
