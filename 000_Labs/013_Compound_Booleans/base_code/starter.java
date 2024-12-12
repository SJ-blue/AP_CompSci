/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");	
		int number1 = sc.nextInt();
		System.out.print("Enter another integer: ");	
		int number2 = sc.nextInt();
		System.out.print("Enter a third integer: ");	
		int number3 = sc.nextInt();
		
		int largest = number1;
		
		if ((number1 >= number2) && (number1 >= number3)) {
			largest = number1;
		}
		if ((number2 >= number1) && (number2 >= number3)) {
			largest = number2;
		}
		if ((number3 >= number1) && (number3 >= number2)) {
			largest = number3;
		}
		System.out.println(largest + " is the largest number in the set.");
		
		int smallest = number1;
		
		if ((number1 <= number2) && (number1 <= number3)) {
			smallest = number1;
		}
		if ((number2 <= number1) && (number2 <= number3)) {
			smallest = number2;
		}
		if ((number3 <= number1) && (number3 <= number2)) {
			smallest = number3;
		}
		System.out.print(smallest + " is the smallest number in the set.");
	}
}
