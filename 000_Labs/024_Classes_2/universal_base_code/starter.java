/*
 *	Author:  
 *  Date: 
*/

import pkg.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter test = new myCharacter();
		System.out.println("You are a " + test.getRole());
		System.out.println("Strength - " + test.getStrength());
		System.out.println("Dexterity - " + test.getDexterity());
		System.out.println("Intelligence - " + test.getIntelligence());
		System.out.println("Charisma - " + test.getCharisma());
	}
}
