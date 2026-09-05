package leetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * 412. Fizz Buzz
 */
public class FizzBuzz {

	public static void main(String[] args) {
		int n = 8;
		List<String> result = fizzBuzz(n);
		
		printArr(result);
	}

	private static void printArr(List<String> result) {
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}		
	}

	public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
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
