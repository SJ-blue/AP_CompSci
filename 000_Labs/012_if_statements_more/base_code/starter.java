/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");	
		int number1 = sc.nextInt();
		
		System.out.print("Enter another number: ");	
		int number2 = sc.nextInt();
		
		if (number1 != number2) {
			System.out.println(number1 + " is not equal to " + number2 + ".");
		} else {
			System.out.print(number1 + " is equal to " + number2 + ".");
		}
	} 
}
