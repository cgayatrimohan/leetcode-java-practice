package coddy;
/**
 * You have 4 kids. Your neighbor comes at your door and gives you N (N > 4) apples. 
 * You want to divide them equally among your children, 
 * so if the number isn't divisible with 4, you need to buy more apples. 
 * An apple costs 1$, output how many dollar you'll spend to split them among your kids. 
 * You should spend as little as possible.

	Write the function to calculate the above, name it apples.
 */
public class Apples {
    public static int apples(int a1) {
        int money = 0;
        if(a1 % 4 != 0) {
            for (int x = 1; x < 4; x++) {
                if ((a1 + x) % 4 == 0) {
                    money += x;
                }
            } 
        } 
        return money;
    }	
}
