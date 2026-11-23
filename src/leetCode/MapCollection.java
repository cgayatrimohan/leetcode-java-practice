package leetCode;

import java.util.*;

public class MapCollection {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		
		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);
		map.put('d', 4);
		map.put('e', 5);
		
		System.out.println("Value of c = " + map.get('c'));
		
		
		System.out.println("Total number of elements in the map: " + map.size());
		
		
		System.out.println(map);
		
		
		
		
	}
}
