package coddy;

public class SubString {

	public static void main(String[] args) {
		String s = "Hello";
		
		System.out.println(getFirstPart(s));

	}

	private static String getFirstPart(String s) {
		int indexOfComma = 0;
		
		if(s.contains(",")) {
			indexOfComma = s.indexOf(",");
		} else {
			System.out.println("String contains comma: ");
			return "NONE";
		}
		
		
		String sub = s.substring(0, indexOfComma);
		
		if(!sub.isEmpty()) {
			return sub;
		} else {
			System.out.println("None");
		}
		return "";
	}
}
