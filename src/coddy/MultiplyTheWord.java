package coddy;

public class MultiplyTheWord {

	public static void main(String[] args) {
		String s = "Hi";
		System.out.println(multiplyWord(s, 3));

	}

//	public static String mulWord(String s, int n) {
////		String mul = s.concat(" ").repeat(n).concat(s);
////		return mul;
//	}
	
	public static String multiplyWord(String s, int n) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
		    if (i > 0) {
		        result.append(" ");
		    }
		    result.append(s);
		}

		return result.toString();
	}
}
