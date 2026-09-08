package coddy;

public class RemoveElementInString {

	public static void main(String[] args) {
		String s = "Apple2Pie";
		int i = 5;
		
		System.out.println(removeAt(s,i));
	}
	public static String removeAt(String s, int i) {
		return s.substring(0,i) + s.substring(i+1);
	}
}
