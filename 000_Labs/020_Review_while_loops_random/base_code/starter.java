/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		boolean guessed = false;
		int number = (int) (Math.random() * 1000) + 1;
		System.out.print("Guess a number from 1 - 1000: ");
		int guess = sc.nextInt();
		
		while (!guessed) {
			if (guess == number) {
				System.out.print("That is correct!");
				guessed = true;
			} else if (guess < number) {
				System.out.print("You are a little too low. Guess again: ");
				guess = sc.nextInt();
			} else if (guess > number) {
				System.out.print("You are a little too high. Guess again: ");
				guess = sc.nextInt();
			}
		}
		
	}
}
