package coddy;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static int[] lens(String[] arr) {
        // Write code here
        int[] length = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            length[i] = arr[i].length();
        }
        return length;
    }
}
