package leetCode;

public class ReversePrefix {

	public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if(index == -1) {
            return word;
        }

        String prefix = word.substring(0, index+1);
        char[] c = prefix.toCharArray();

        int left = 0;
        int right = prefix.length() - 1;

        while(left < right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }

        prefix = new String(c);

        String result = prefix.concat(word.substring(index+1));
        return result;
    }
	
    public String reversePrefixII(String word, char ch) {
        int chIndex = word.indexOf(ch);
        if (chIndex == -1) {
            return word;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            // Add characters through ch to the result in reverse order
            if (i <= chIndex) {
                result.append(word.charAt(chIndex - i));
            }
            // Add the rest of the characters to result
            else {
                result.append(word.charAt(i));
            }
        }

        return result.toString();
    }
}
