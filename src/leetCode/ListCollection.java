package leetCode;

import java.util.*;

/**
 * Add elements into list
 * Remove elements 
 * find elements
 * print elements
 */
public class ListCollection {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		
		nums.remove(2); // should remove 3 from the list
		
		nums.get(2); // should return 4
		
		System.out.println(nums);
		int totalSum = 0;
		
		for(int num : nums) {
			 totalSum = totalSum + num;
			
		}
		System.out.println("Total sum of all elements in a list = " + totalSum);

	}

}
