package leetCode;

public class isNumber {

	public static void main(String[] args) {
		String s = "123";
		System.out.println(findNumber(s));
		
	}
	
	public static boolean findNumber(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
