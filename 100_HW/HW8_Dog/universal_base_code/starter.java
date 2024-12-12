/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog clifford = new Dog();
		clifford.dogToString();
		Dog max = new Dog("Max", 1);
		max.dogToString2();
		System.out.println("------------------------------");
		System.out.println("");
		Dog daisy = new Dog("Daisy", "golden");
		daisy.dogToString2();
		System.out.println("------------------------------");
		System.out.println("");
		System.out.println("------------------------------");
		if (max.isSleeping()) {
			System.out.println(max.getName() + " is sleeping, don't wake him up.");
			if (daisy.isSleeping()){
			System.out.println(daisy.getName() + " is sleeping too.");	
			} else {
			System.out.println(daisy.getName() + " is awake.");
			}
		} else {
			System.out.println("Both dogs are barking.");
		}
		
		System.out.println("------------------------------");
		System.out.println("");
	}
}
