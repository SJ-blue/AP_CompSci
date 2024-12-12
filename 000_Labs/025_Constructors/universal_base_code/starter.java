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
		System.out.println("You are a " + test.getRole());
		System.out.println("Strength - " + test.getStrength());
		System.out.println("Dexterity - " + test.getDexterity());
		System.out.println("Intelligence - " + test.getIntelligence());
		System.out.println("Charisma - " + test.getCharisma());
		System.out.print("Would you like to be a wizard, warrior, or rogue? ");
		String  role = sc.nextLine();
		role = role.toLowerCase();
		myCharacter test2 = new myCharacter(role);
		System.out.println(test2);
		System.out.println("You are a " + test2.getRole());
		System.out.println("Strength - " + test2.getStrength());
		System.out.println("Dexterity - " + test2.getDexterity());
		System.out.println("Intelligence - " + test2.getIntelligence());
		System.out.println("Charisma - " + test2.getCharisma());
	}
}
