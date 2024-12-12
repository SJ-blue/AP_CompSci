/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character {
	String role = new String("Wizard");
	int strength = 5;
	int dexterity = 3;
	int intelligence = 7;
	int charisma = 3;
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Character myCharacter = new Character();
		System.out.println("You are a " + myCharacter.role);
		System.out.println("Strength - " + myCharacter.strength);
		System.out.println("Dexterity - " + myCharacter.dexterity);
		System.out.println("Intelligence - " + myCharacter.intelligence);
		System.out.println("Charisma - " + myCharacter.charisma);
	}
}
