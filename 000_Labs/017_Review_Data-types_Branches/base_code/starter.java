/*
 *	Author:  
 *  Date: 
*/
// Known issues: User can input an invalid role
//               Asks for a 2nd number if the 1st is invalid but does not ask more than once
//               InputMismatchException no check if something is an int
//               User can input a negative number which will then be subtracted from your 20 skill points (subtracting a negative number)
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = sc.nextLine();
		System.out.print("What is your title? (ex. Slayer of dragons) ");
		String title = sc.nextLine();
		System.out.print("Would you like to be a wizard, warrior, or rogue? ");
		String  role = sc.nextLine();
		role = role.toLowerCase();
		
		if (role.equals("wizard")) {
			System.out.println("You've chosen the Wizard!");
		} else if (role.equals("warrior")) {
			System.out.println("You've chosen the Warrior!");
		} else if (role.equals("rogue")) {
			System.out.println("You've chosen the Rogue!");
		} else {
			System.out.println("That was not one of the options. Rerun the code.");
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		if (strength <= 10) {
	    System.out.println("You have " + (20 - strength) + " points left to spend");
		} else if (strength > 10) {
			System.out.print("Please input a smaller value. Strength (1-10): ");
			strength = sc.nextInt();
		}
   	    System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		if (dexterity <= 10) {
		System.out.println("You have " + (20 - strength - dexterity) + " points left to spend");
		} else if (dexterity > 10) {
			System.out.print("Please input a smaller value. Dexterity (1-10): ");
			dexterity = sc.nextInt();
		}
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		if (intelligence <= 10) {
		System.out.println("You have " + (20 - strength - dexterity - intelligence) + " points left to spend");
		} else if (intelligence > 10) {
			System.out.print("Please input a smaller value. Intelligence (1-10): ");
			intelligence = sc.nextInt();
		}
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		if (charisma <= 10) {
		System.out.println("You have " + (20 - strength - dexterity - intelligence - charisma) + " points to spend next time.");
		} else if (charisma > 10) {
			System.out.print("Please input a smaller value. Charisma (1-10): ");
			charisma = sc.nextInt();
		}
		System.out.println("___________________________________________");
		System.out.println("You are " + name + ", the " + title + ".");
		System.out.println("You are a " + role + " with the following stats.");
		System.out.println("Strength - " + strength);
		System.out.println("Dxterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
	}
}
