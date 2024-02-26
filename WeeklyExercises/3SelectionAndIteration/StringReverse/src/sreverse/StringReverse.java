package sreverse;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your sentence: ");
		String sentence = scanner.next();
		
		scanner.close();
		
		Scanner wordScanner = new Scanner(sentence);
		
		while (wordScanner.hasNext()) {
			String word = wordScanner.next();
			String reverseword = reverseString(word);
			
			System.out.print(reverseword + " ");
		}
	
		wordScanner.close();

	}
	
	public static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder(str);
		return reversed.reverse().toString();
	}

}
