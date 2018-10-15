import java.util.Scanner;

public class CapStoneWeek1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userContinue;

		System.out.println("Welcome to the Pig Latin Translator");

		do {
			System.out.println("Enter a line to be translated:   ");
			String userWord = scan.next();
			System.out.println(translateToPigLatin(userWord));
			System.out.println("Would you like continue Y/N?");
			userContinue = scan.next();
		} while (userContinue.equalsIgnoreCase("Y"));
		System.out.print("Thank you for playing! ");
		System.out.println("Goodbye.");

	}

	public static String translateToPigLatin(String string) {
		String end = "";
		String spacing = "\\s+";
		String[] words = string.split(spacing);
		for (int i = 0; i < words.length; i++) {
			if (vowelChecker(words[i].charAt(0))) {
				end += words[i] + "way";
            } 
			   else if  (vowelChecker(words[i].charAt(1)))
		       {
					end += words[i].substring(1) + words[i].substring(0, 1) + "ay";
				}
			else 	if ( vowelChecker(words[i].charAt(2))) {
				end += words[i].substring(2) + words[i].substring(0,2) + "ay" ;
		   	}
			else if ( vowelChecker(words[i].charAt(3))) {
				end += words[i].substring(3) + words[i].substring(0,3) + "ay" ;
			}
			else if  (vowelChecker(words[i].charAt(4))) {
				end+= words [i].substring(4)+ words[i].substring(0,4) + "ay";
			}
			
		}
		return end;

	}

	public static boolean vowelChecker(char c) {
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
