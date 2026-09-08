package leetCode;

import java.util.*;

public class IntersectionOfMultipleArrays {

	public static void main(String[] args) {
		int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
		List<Integer> result = intersection(nums);
		
			for(int x : result) {
				System.out.print(x + " ");;
			}

	}
	public static List<Integer> intersection(int[][] nums) {
		Map<Integer, Integer> counts = new HashMap<>();
		List<Integer> ans = new ArrayList<>();
		int n = nums.length;
		
		for(int[] arr : nums) {
			for(int x : arr) {
				counts.put(x, counts.getOrDefault(x, 0)+1);
			}
		}
		
		for(int key: counts.keySet()) {
			if(counts.get(key) == n) {
				ans.add(key);
			}
		}
		
		Collections.sort(ans);
		return ans;
	}
}
