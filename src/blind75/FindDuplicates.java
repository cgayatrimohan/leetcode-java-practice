package blind75;

import java.util.*;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] num = {2,3,4,2,3,5,6};
		findDuplicates(num);
	}
	
	private static void findDuplicates(int[] num) {
		Set<Integer> uniqueSet = new HashSet<>();
		Set<Integer> duplicateSet = new HashSet<>();
		
		for(int i = 0; i < num.length; i++) {
			if(!uniqueSet.contains(num[i])) {
				uniqueSet.add(num[i]);
			} else {
				duplicateSet.add(num[i]);
			}
		}
		System.out.println(duplicateSet);
 	}


}
