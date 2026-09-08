package coddy;
import java.util.*;

public class BasicSorting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int temp = 0;
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println(a + " " + b + " "+ c);
		scanner.close();

	}

	/**
	 *   // 1. Put the numbers into an array
        int[] nums = {a, b, c};

        // 2. Sort the array in ascending order
        Arrays.sort(nums);

        // 3. Output the sorted sequence
        System.out.println("Sorted sequence: " + nums[0] + " " + nums[1] + " " + nums[2]);

        scanner.close();
	 */
}
