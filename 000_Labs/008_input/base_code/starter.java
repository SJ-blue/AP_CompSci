/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your name? "); 
		String text = sc.nextLine();

		System.out.print("What is your age? ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("In what month were you born? ");	
		String month = sc.nextLine();
		
		System.out.print("What day of the month were you born? ");	
		int day = sc.nextInt();

		System.out.print("What year were you born? ");
		int year = sc.nextInt();

		System.out.print("How much is a buck fifty? "); 
		double number = sc.nextDouble();
		
		System.out.println();
		System.out.println("Your name is " + text + "."); 
		System.out.println("You are " + age + " years old.");
		System.out.println("You were born on " + month + " " + day + ", " + year + ".");
		System.out.print("You believe a buck fifty is $");
		System.out.printf("%,.2f", number);
		System.out.print(".");

	}
}
