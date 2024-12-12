/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence to translate into pig latin: ");
        String sentence = sc.nextLine();
        System.out.println("Here is your sentence in pig latin:");
        System.out.print(phraseToPigLatin(sentence));
	}
	public static String phraseToPigLatin(String phrase) {
		String result = "";
		while (phrase.indexOf(" ") != -1) {
			// find the first word
			String word = phrase.substring(0, phrase.indexOf(" "));
			// run it through wordToPigLatin
			String newWord = wordToPigLatin(word);
			// add that to result
			result += newWord + " ";
			// get rid of first word in sentence
			phrase = phrase.substring(phrase.indexOf(" ") + 1);
		}
		result += wordToPigLatin(phrase);
		return result;
	}
	public static boolean isVowel(String letter) {
		letter = letter.toLowerCase();
		return letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u");
	}
	public static String wordToPigLatin(String word) {
		if (word.length() == 1) {
			return (word + "-way");
		}
		if (word.length() == 2 && !isVowel(word.substring(0, 1)) && !isVowel(word.substring(1, 2))) {
			return word + "-ay";
        }
        if (!isVowel(word.substring(0, 1)) && isVowel(word.substring(1, 2))) {
			return (word.substring(1) + "-" + word.substring(0, 1) + "ay");
        } else if (!isVowel(word.substring(0, 1)) && !isVowel(word.substring(1, 2))) {
        	return (word.substring(2) + "-" + word.substring(0, 2) + "ay");
        } else {
        	return (word + "-way");
        }
	}	
}
