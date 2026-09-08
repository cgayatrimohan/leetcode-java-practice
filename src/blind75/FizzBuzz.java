package blind75;

import java.util.*;

public class FizzBuzz {

	public static void main(String[] args) {
		int num = 12;
		List<String> printArray = printFizzBuzz(num);
		
		System.out.print(printArray);

	}
	
	private static List<String> printFizzBuzz(int num) {
		List<String> result = new ArrayList<>();
		
		if(num == 0) {
			return new ArrayList<>();
		}
		
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				result.add("FizzBuzz");
			} else if (i % 3 == 0) {
				result.add("Fizz");
			} else if(i % 5 == 0) {
				result.add("Buzz");
			} else {
				result.add(Integer.toString(i));
			}
		}
		return result;
	}
}
