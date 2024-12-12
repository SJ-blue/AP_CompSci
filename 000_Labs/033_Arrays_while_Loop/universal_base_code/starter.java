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
		int [] arr = new int[1001];
		int i = 0;
		while (i < 1001) {
		 	arr[i] = (int) (Math.random() * 100 + 1);
		 	System.out.println(arr[i]);
		 	i++;
		 }

		
	}
}
