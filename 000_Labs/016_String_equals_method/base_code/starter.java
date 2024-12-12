/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Role options: wizard, a warrior, and a rogue. Please choose your role: ");
		String role = sc.nextLine();
		role = role.toLowerCase();
		
		if (role.equals("wizard") || role.equals("warrior") || role.equals("rogue")) {
			System.out.print("Your role is a " + role + ".");
		} else {
			System.out.print("The role that you have chosen is not one of the options.");
		}
	}
}
