package leetCode;
/**
 * Counting Elements
 * 
 * Given an integer array arr, count how many elements x there are, 
 * such that x + 1 is also in arr. If there are duplicates in arr, 
 * count them separately.
 * 
 */
public class CountingNumbers {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(countElements(arr));
	}

	public static int countElements(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (integerInArray(arr, x + 1)) {
                count++;
            }
        }
        return count;
    }

    public static boolean integerInArray(int[] arr, int target) {
        for (int x : arr) {
            if (x == target) {
                return true;
            }
        }
        return false;
    }
}
