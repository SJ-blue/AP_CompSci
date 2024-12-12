/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String sentence) {
		System.out.println(sentence);
	}
	
	public static void toStringCombined(String sentence1, String sentence2) {
		System.out.println(sentence1 + " " + sentence2);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		toString("Write a sentence: ");
		String sentence1 = sc.nextLine();
		toString("Write another sentence: ");
		String sentence2 = sc.nextLine();
		toStringCombined(sentence1, sentence2);
		System.out.println();
		toString(sentence1);
		toStringCombined(sentence1, sentence2);
	}
}
