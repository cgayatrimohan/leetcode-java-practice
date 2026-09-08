package codedex;

/**
 * YOU MADE IT TO THE END OF CHAPTER 7! 🎉 We've learned a lot about classes and
 * objects in Java.... but we're not done yet! 😅 Inspired by the mobile game
 * "Good Coffee, Great Coffee" ☕️☕️☕️☕️☕️
 */

// Create a new class named Order here! 💖
class Order {
	String orderName;
	String drinkName;
	Double price;
	Boolean isIced;
	char size;
	Boolean toGo;

	Order(String orderName, String drinkName, Double price, Boolean isIced, char size, Boolean toGo) {
		this.orderName = orderName;
		this.drinkName = drinkName;
		this.price = price;
		this.isIced = isIced;
		this.size = size;
		this.toGo = toGo;
	}
}

public class CoffeeShop {
	public static void main(String[] args) {
		// Create a new Order object here! 💖
		Order order1 = new Order("Elliot", "Matcha", 6.99, true, 'L', false);
		Order order2 = new Order("Kate", "Espresso", 4.99, true, 'M', true);
		Order order3 = new Order("Allison", "Mocha", 7.99, true, 'L', false);

		// Add print statements here! 💖
		System.out.println("Order for " + order1.orderName + ": " + order1.drinkName + " size: " + order1.size
				+ " iced? " + order1.isIced);
		System.out.println("Order for " + order2.orderName + ": " + order2.drinkName + " size: " + order2.size
				+ " iced? " + order2.isIced);
		System.out.println("Order for " + order3.orderName + ": " + order3.drinkName + " size: " + order3.size
				+ " iced? " + order3.isIced);
	}

}
