package coddy;

public class CapitalizeStart {

	public static void main(String[] args) {
		String s = "hELLO";
		String capitalStart = s.substring(0,1).toUpperCase() + s.substring(1);
		
		System.out.println(capitalStart);
	}

	/**
	 * Write a function named capitalize that gets a 
	 * string (only lower case) and capitalizes the 
	 * first letter of each word and prints the result.
	 * 
	 * @param s
	 * @return
	 */
	public static String capitalize(String s) {
		String[] words = s.split(" ");
		
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			words[i] = word.substring(0,1).toUpperCase() + word.substring(1);
		}
		
		return String.join(" ", words);
	}
}
