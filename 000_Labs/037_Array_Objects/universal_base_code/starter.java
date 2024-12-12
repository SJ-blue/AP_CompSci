/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] wiz = new Wizard[100];
		for (int i = 0; i < wiz.length; i++) {
			wiz[i] = new Wizard("Harry");
		}
		Warrior[] warriors = new Warrior[100];
		for (int i = 0; i < warriors.length; i++) {
			warriors[i] = new Warrior("Bob");
		}
		int currWiz = 0;
		int currWarrior = 0;
		while (!wiz[wiz.length - 1].isDead() && !warriors[warriors.length - 1].isDead()) {
			wiz[currWiz].attack(warriors[currWarrior]);
			if(warriors[currWarrior].isDead()){
				currWarrior++;
			}
			if (currWarrior < 100) {
				warriors[currWarrior].attack(wiz[currWiz]);
			}
			if(wiz[currWiz].isDead()){
				currWiz++;
			}
			
		}
		if (currWiz < 99) {
			System.out.println("The wizards won. There were still " + (100 - currWiz) + " wizards standing.");
		}
		if (currWarrior < 99) {
			System.out.println("The warriors won. There were still " + (100 - currWarrior) + " warriors standing.");
		}
	}
}
