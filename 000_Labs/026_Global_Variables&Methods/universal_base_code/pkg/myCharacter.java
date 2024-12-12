/*
 *	Author:  
 *  Date: 
*/

package pkg;

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
	public String toString() {
		if (role.equals("wizard")) {
			return "You've chosen the Wizard! Excelsior!";
		} else if (role.equals("rogue")) {
			return "You've chosen the Rogue! How cunning!";
		} else if (role.equals("warrior")) {
			return "You've chosen the Warrior! For honor!";
		} else {
			return "";
		}
	}
	
	public String getRole() {
	    return role;
	}
	public void setRole(String assignedRole) {
		role = assignedRole;
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

