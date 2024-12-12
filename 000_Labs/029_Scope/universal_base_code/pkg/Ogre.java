/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	private String name;

	public Ogre() {
		name = "Shrek";
		boolean ugly = true;
	}

	public String getName(){
		return name;
	}

	public boolean isUgly(){
		return true;
	}

	public void interact(Donkey donkey){
		System.out.println(donkey.getName() + ", what are you doing in my swamp?!");
		return;
	}


}
