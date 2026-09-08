package coddy;

public class ConvertNumberToArray {

	public static void main(String[] args) {
		int n = 15647;
		int[] arr = convert(n);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int[] convert(int n) {
		int original = n;
		int digits = String.valueOf(original).length();
		int[] arr = new int[digits];
		
		for(int i = digits - 1; i >= 0; i--) {
			arr[i] = n % 10;
			n /= 10;
		}
		return arr;
	}
}
