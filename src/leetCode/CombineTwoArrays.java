package leetCode;

import java.util.ArrayList;
import java.util.List;

public class CombineTwoArrays {

	public static void main(String[] args) {
		int[] a1= {1,2,3};
		int[] a2 = {4,9,8};
		
		int[] result = combineArrays(a1, a2);
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
	}
	/**
	 * If a list can be used
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static List<Integer> combine(int[] arr1, int[] arr2) {
		List<Integer> answer = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				answer.add(arr1[i]);
				i++;
			} else {
				answer.add(arr2[j]);
				j++;
			}
		}
		
		while(i < arr1.length) {
			answer.add(arr1[i]);
			i++;
		}
		
		while(j < arr2.length) {
			answer.add(arr2[j]);
			j++;
		}

		return answer;
	}
	
	/**
	 * If the return type is an array
	 * 
	 * @param a1
	 * @param a2
	 * @return
	 */
	@SuppressWarnings("unused")
	public static int[] combineArrays(int[] a1, int[] a2) {
		int[] result = new int[a1.length + a2.length];
		
		if(a1 == null) a1 = new int[0];
		if(a2 == null) a2 = new int[0];
		
		for(int i = 0; i < a1.length; i++) {
			result[i] = a1[i];
		}
		
		for(int j = 0; j < a2.length; j++) {
			result[a1.length + j] = a2[j];
		}
		
		return result;
	}
}
