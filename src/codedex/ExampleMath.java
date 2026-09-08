package codedex;

public class ExampleMath {

	public static void main(String[] args) {
		// Add your code here! 💖
		double timeOne = 750.13;
		double timeTwo = 738.23;

		double travelledDist = launchCalculator(timeOne, timeTwo);

		System.out.println("Rounded distance: " + travelledDist + " meteres");

	}

	public static double launchCalculator(double timeOne, double timeTwo) {
		double distanceTravelled = timeOne * timeTwo;
		double roundedDist = Math.round(distanceTravelled);

		return roundedDist;
	}

}
