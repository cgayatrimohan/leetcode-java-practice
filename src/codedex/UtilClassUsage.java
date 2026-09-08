package codedex;

import java.util.Scanner;

public class UtilClassUsage {

	public static void main(String[] args) {
        // Add your code here! 💖
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;
        
        System.out.println("this sentence has " + wordCount + " words!");
        scanner.close();
	}

}
