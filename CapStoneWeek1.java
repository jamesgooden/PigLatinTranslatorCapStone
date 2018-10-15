import java.util.Scanner;

public class CapStoneWeek1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userWord;
		String userContinue;
		int atSymbol;

		System.out.println("Welcome to the Pig Latin Translator");

		do { 
			System.out.println("Type a word you would like to translate:  ");
			userWord = scan.next();
			atSymbol = userWord.indexOf('@'); // keeps entries with the @ symbol the same
			if (atSymbol > 0) {
				System.out.println(userWord);
			} else if (userWord.length() <= 1) {
				System.out.println("Please enter a word with atleast 2 characters");  // validates user entry for words with enough characters
			}

			else
				System.out.println(translateToPigLatin(userWord.toLowerCase())); // turns user input into Pig Latin / converts to lower case
			System.out.println("Translate another word? (y/n) ");
			userContinue = scan.next();

		} while (userContinue.equalsIgnoreCase("Y"));
		System.out.print("Thank you for playing! ");
		System.out.println("Goodbye.");
		scan.close();
	}

	public static String translateToPigLatin(String string) {   //  This is  where the words are translated based on what the index of the vowel is
		String translate = "";
		String spacing = "\\s+";
		String[] words = string.split(spacing);
		for (int i = 0; i < words.length; i++) {
			if (vowelChecker(words[i].charAt(0))) {             
				translate += words[i] + "way";
			} else if (vowelChecker(words[i].charAt(1))) {
				translate += words[i].substring(1) + words[i].substring(0, 1) + "ay";
			} else if (vowelChecker(words[i].charAt(2))) {
				translate += words[i].substring(2) + words[i].substring(0, 2) + "ay";
			} else if (vowelChecker(words[i].charAt(3))) {
				translate += words[i].substring(3) + words[i].substring(0, 3) + "ay";
			} else if (vowelChecker(words[i].charAt(4))) {
				translate += words[i].substring(4) + words[i].substring(0, 4) + "ay";
			} else if (vowelChecker(words[i].charAt(5))) {
				translate += words[i].substring(5) + words[i].substring(0, 5) + "ay";
			} else {

				translate += words[i] + "way";
			}

		}
		return translate;

	}

	public static boolean vowelChecker(char c) {   //This tells the translator if the character has a vowel
		if (c == 'a' || c == 'A')
			return true;
		if (c == 'e' || c == 'E')
			return true;
		if (c == 'i' || c == 'I')
			return true;
		if (c == 'o' || c == 'O')
			return true;
		if (c == 'u' || c == 'U')
			return true;
		return false;
	}

}
