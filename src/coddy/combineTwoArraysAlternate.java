package coddy;

public class combineTwoArraysAlternate {

	public static void main(String[] args) {
		int[] a1 = {1,2,3};
		int[] a2 = {4,5,6};

		int[] result = alternate(a1, a2);

		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	/**
	 * Combine arrays with each element alternating elements.
	 * 
	 * @param a1
	 * @param a2
	 * @return int[]
	 */
	public static int[] alternate(int[] a1, int[] a2) {
		int[] combine = new int[a1.length + a2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while(i < a1.length && j < a2.length) {
			combine[k++] = a1[i++];
			combine[k++] = a2[j++];
		}

		while (i < a1.length) {
			combine[k++] = a1[i++];
		}

		while (j < a2.length) {
			combine[k++] = a2[j++];
		}

		return combine;
	}
}
