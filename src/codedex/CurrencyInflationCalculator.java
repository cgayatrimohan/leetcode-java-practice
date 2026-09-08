package codedex;

import java.util.Random;
import java.util.Scanner;

public class CurrencyInflationCalculator {

	public static void main(String[] args) {
	      // Write your code here 💖
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your $USD balance?");
        System.out.print(">> ");

        double usd = scanner.nextDouble();

        // Base exchange rates
        double rupeesRate = 0.44;
        double gilRate = 54.87;
        double goldenCoinsRate = 2.23;

        // Calculate new rates
        double rupees = usd * rupeesRate * (1 + inflationCalculator(usd));
        double gil = usd * gilRate * (1 + inflationCalculator(usd));
        double goldenCoins = usd * goldenCoinsRate * (1 + inflationCalculator(usd));

        System.out.println();
        System.out.println("Your rates today are:");
        System.out.println("- - - - - - - - - - - - -");
        System.out.printf("Rupees: %.2f%n", rupees);
        System.out.printf("Gil: %.2f%n", gil);
        System.out.printf("Golden Coins: %.2f%n", goldenCoins);

        scanner.close();
	}
	
	public static double inflationCalculator(double usd) {
		Random random = new Random();
        double min = -0.03;
        double max = 0.05;
		double amountWithInflation = min + (max - min) * random.nextDouble();
		return amountWithInflation;
	}

}
