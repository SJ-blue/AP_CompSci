/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int number = 897;
		System.out.println("I am thinking of a number between 1 and 1000.");	
		System.out.print("Please guess an integer: ");	
		int number1 = sc.nextInt();
		
		if ((number1 == number)) {
			System.out.print("You are correct!");
		} else {
			System.out.print("You were incorrect, my number was " + number + ".");
		}
	}
}
