/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr = new int[20];
		int num = (int) (Math.random() * 10 + 1);
		int count = 0;
		int count1 = 0;
		System.out.println("----------------------------------------------------");
		System.out.println("These are the " + arr.length + " numbers:");
		
		for (int i = 0; i < arr.length; i++) {
		 	arr[i] = (int) (Math.random() * 10 + 1);
		 	System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println("The random number to look for is " + num);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
		 		count++;
		 		System.out.println("Duplicate found at index: " + i);
		 	}
		}
		System.out.println("Total number of duplicates for " + num + " is " + count);
		System.out.println("----------------------------------------------------");
		System.out.println("Looking for two in a row: ");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[(i + 1)]) {
		 		count1++;
		 		System.out.println("Two in a row found at indexes " + i + " and " + (i + 1) + "." + " The number is " + arr[i]);
		 	}
		}
	}
}
