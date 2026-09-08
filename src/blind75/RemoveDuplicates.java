package blind75;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] num = {3,4,5,6,3,4,5,6};
		remove(num);

	}

	private static void remove(int[] num) {
		Set<Integer> uniqueSet = new HashSet<>();
		
		for(int i = 0; i < num.length; i++) {
			if(!uniqueSet.contains(num[i])) {
				uniqueSet.add(num[i]);
			}
		}
		System.out.println(uniqueSet);
	}
}
