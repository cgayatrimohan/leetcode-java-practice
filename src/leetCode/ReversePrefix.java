package leetCode;

/**
 * ReveresePrefix -> leetCode = teelCode
 */
public class ReversePrefix {

	public static void main(String[] args) {
		String str = "LeetCode";
		System.out.println(reversePrefix(str, 'C'));
	}

	public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        
        if(index <= -1) return word;

        StringBuilder result = new StringBuilder();
   
        // from index element to starting
        for(int i = index - 1; i >= 0; i--) { 
        	result.append(word.charAt(i));
        }
        
        // from index element to ending
        for(int i = index; i < word.length(); i++) {
        	result.append(word.charAt(i));
        }
        
        return result.toString();
    }

}
