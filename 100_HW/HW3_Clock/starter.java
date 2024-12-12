/*
 *	Author: Sakura Bolen
 *  Date: September 16, 2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What day of the week is it? (0 = Sunday, 1 = Monday, 2 = Tuesday, etc...): ");
		int day = sc.nextInt();
		
		if (day == 0 || day == 6){
			System.out.print("Wake up at 10:00am.");
		} else if (day > 0 && day < 6){
			System.out.print("Wake up at 7:00am.");
		}
	}
}
