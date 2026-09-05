package leetCode;

public class GetEqualSubstrings {

	public static int equalSubstrings(String s, String t, int maxCost) {
		int maxLen = 0;
		int left = 0;
		int currCost = 0;
		
		for(int right = 0; right < s.length(); right++) {
			currCost += Math.abs(s.charAt(right) - t.charAt(right));
			
			while(currCost > maxCost) {
				currCost -= Math.abs(s.charAt(left) - Math.abs(t.charAt(left)));
				left++;
			}
			maxLen = Math.max(maxLen, right - left + 1);
		}
		return maxLen;
		
	}
}
