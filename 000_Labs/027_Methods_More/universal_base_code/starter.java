/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		myCharacter test = new myCharacter();
		test.myToString();
		System.out.print("Would you like to be a wizard, warrior, or rogue? ");
		String  role = sc.nextLine();
		role = role.toLowerCase();
		myCharacter test2 = new myCharacter(role);
		test2.setRole(role);
		test2.myToString();
	}
}