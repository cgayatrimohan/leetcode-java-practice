package codedex;

import java.util.Random;
import java.util.Scanner;

public class CompareNumber {

	public static void main(String[] args) {
	    // Add your code here! 💖
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 10: ");
        int num = scanner.nextInt();

        Random rand = new Random();
        int computerNum = rand.nextInt(11);
        System.out.println("The computer guesses: " + computerNum);

        if(num == computerNum) {
          System.out.println("The computer guessed correct!");
        } else {
          System.out.println("The computer guessed wrong!");
        }
        scanner.close();
	}

}
