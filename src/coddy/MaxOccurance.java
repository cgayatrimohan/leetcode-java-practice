package coddy;

import java.util.*;

public class MaxOccurance {

	public static void main(String[] args) {
		int[] numbers = { 4, 5, 4, 2, 2, 3, 4, 2 };
		System.out.println("Most frequent: " + maxOccur(numbers));

	}

	public static int maxOccur(int[] arr) {
		Map<Integer, Integer> counts = new HashMap<>();

		for (int i : arr) {
			counts.put(i, counts.getOrDefault(i, 0) + 1);
		}

		int maxCount = 0;
		int result = arr[0];

		for (int i : arr) {
			int currentCount = counts.get(i);

			if (currentCount > maxCount) {
				maxCount = currentCount;
				result = i;
			}
		}
		return result;
	}
}
