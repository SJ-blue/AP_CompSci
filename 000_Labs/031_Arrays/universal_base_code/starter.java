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
		int [] arr = new int [10];
		int i = 0;
		int y = 9;
		while (i < 10) {
		 	arr[i] = y;
		 	System.out.println(arr[i]);
		 	i++;
		 	y--;
		 }

		
	}
}
