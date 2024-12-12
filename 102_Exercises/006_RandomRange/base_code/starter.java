/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int number1 = sc.nextInt();
		System.out.print("Please enter another integer that is larger than the 1st integer: ");
		int number2 = sc.nextInt();
		System.out.println("Your range is from " + number1 + " to " + number2 + ".");
		System.out.println("Here are 5 numbers generated in that range.");
		
		for (int i = 0; i < 4; i++) {
			System.out.print((int) (Math.random() * (number2 - number1)) + number1 + ", ");
		}
		System.out.print((int) (Math.random() * (number2 - number1)) + number1 + ". ");
		//System.out.print((int) (Math.random() * (number2 - number1)) + number1 + ", ");
		//System.out.print((int) (Math.random() * (number2 - number1)) + number1 + ", ");
		//System.out.print((int) (Math.random() * (number2 - number1)) + number1 + ", ");
		//System.out.print((int) (Math.random() * (number2 - number1)) + number1 + ", ");
		//System.out.print((int) (Math.random() * (number2 - number1)) + number1 + ". ");
	}
}
