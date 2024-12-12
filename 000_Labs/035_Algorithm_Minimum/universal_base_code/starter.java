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
		int len = (int) (Math.random() * 150 + 51);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
		 	arr[i] = (int) (Math.random() * 100 + 1);
		 	System.out.println(arr[i]);
		 	if (arr[i] < min) {
		 		min = arr[i];
		 	}
		 	if (arr[i] > max) {
		 		max = arr[i];
		 	}
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = (arr[i] + sum);
		}
		int average = sum / arr.length;
		System.out.println("The length of this array is " + arr.length + ".");
		System.out.println("The minimum value is " + min + ".");
		System.out.println("The maximum value is " + max + ".");
		System.out.println("The average value is " + average + ".");
	}
}
