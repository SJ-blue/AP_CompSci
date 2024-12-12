/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String [] song = new String[10];
		song[0] = "People turn on you just like the wind";
		song[1] = "Everybody is a fair-weather friend";
		song[2] = "In the end you're better off alone";
		song[3] = "Any way the wind blows";
		song[4] = "When your body aches to lay it down";
		song[5] = "When you're hungry and there ain't enough to go 'round";
		song[6] = "Ain't no length to which a girl won't go";
		song[7] = "Any way the wind blows";
		song[8] = "and sometimes you think";
		song[9] = "(Wind comes up, you) would do anything";
		for (int i = 0; i < 10; i++) {
			System.out.println(song[i]);
		}
	}
}
