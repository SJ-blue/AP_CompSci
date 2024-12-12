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
		System.out.println("Enter your pet peeve: " );
		String word = sc.nextLine();
		String sentence1 = "Did you just say \"";
		String sentence2 = "\" is your pet peeve? \n \t Wow how dare you. \\ Get out of here!";
		System.out.println(sentence1 + word + sentence2);
		BaseClass test = new BaseClass();
	}
}
