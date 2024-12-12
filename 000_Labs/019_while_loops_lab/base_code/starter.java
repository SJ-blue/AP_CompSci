/*
 *	Author:  Sakura Bolen
 *  Date: September 22, 2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		System.out.print("Enter a name: ");
		String name = sc.nextLine();
		
		System.out.print("How many times should the name be printed: ");
		int number = sc.nextInt();
		
		while (i <= number) {
			System.out.println(name);
			i++;
		}
	}
}
