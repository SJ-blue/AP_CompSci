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
		int [] arr = new int[20];
		for (int i = 0; i < 1001; i++) {
		 	arr[i] = (int) (Math.random() * 10 + 1);
		 	System.out.println(arr[i]);
		 }
	}
}
