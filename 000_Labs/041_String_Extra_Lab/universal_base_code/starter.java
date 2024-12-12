/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println(backwards(sentence));
		
	}
	public static String backwards(String sentence) {
		String result = "";
		int space = sentence.indexOf(" ");
		while (space != -1) {
			String word = sentence.substring(0, space);
            sentence = sentence.substring(space + 1);
			result = word + " " + result;
			space = sentence.indexOf(" ");
		}
		return sentence + " " + result;
	}
}
