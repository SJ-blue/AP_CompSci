/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	private String role;
	private int strength = 0;
	private int dexterity = 0;
	private int intelligence = 0;
	private int charisma = 0;
	
	public myCharacter() {
		role = "No role";
	}
	public myCharacter(String assignedRole) {
		assignedRole = assignedRole.toLowerCase();
		if (assignedRole.equals("wizard") || assignedRole.equals("warrior") || assignedRole.equals("rogue")) {
			role = assignedRole;
		} else {
			role = "No role";
		}
	}
	public void myToString() {
		System.out.println("You are a " + role);
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
	}
	public String setRole(String role) {
		if (role.equals("wizard")) {
			System.out.println("You've chosen the Wizard! Excelsior!");
		} else if (role.equals("rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
		} else if (role.equals("warrior")) {
			System.out.println("You've chosen the Warrior! For honor!");
		} else {
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		return this.role;
	}
	public int setStrength(int strength) {
		if (strength < 0) {
			this.strength = 0;
		}
		this.strength = strength;
		return this.strength;
	}
	public int setDexterity(int dexterity) {
		if (dexterity < 0) {
			this.dexterity = 0;
		}
		this.dexterity = dexterity;
		return this.dexterity;
	}
	public int setIntelligence(int intelligence) {
		if (intelligence < 0) {
			this.intelligence = 0;
		}
		this.intelligence = intelligence;
		return this.intelligence;
	}
	public int setCharisma(int charisma) {
		if (charisma < 0) {
			this.charisma = 0;
		}
		this.charisma = charisma;
		return this.charisma;
	}
	public boolean setAll(String role, int strength, int dexterity, int intelligence, int charisma) {
		setRole(role);
		setStrength(strength);
		setDexterity(dexterity);
		setIntelligence(intelligence);
		setCharisma(charisma);
		return true;
	}
	public String getRole() {
	    return role;
	}
	public int getStrength() {
	    return strength;
	}
	public int getDexterity() {
	    return dexterity;
	}
	public int getIntelligence() {
	    return intelligence;
	}
	public int getCharisma() {
	    return charisma;
	}
}