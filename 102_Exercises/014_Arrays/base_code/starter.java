/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.println("Value: ");	 	
		int [] arr = new int[1001];
		for (int i = 0; i < arr.length; i++) {
		 	arr[i] = (i + 1) * 3;
		 	System.out.println(arr[i]);
		 }
	System.out.println("----------------------------");	 
	System.out.println("Value: ");	 	
		int [] arr2 = new int[1001];
		int z = 0; 
		int x = 1000;
		while (z < arr.length) {
			arr2[z] = x;
			System.out.println(arr2[z]);
		 	z++;
		 	x--;
		 }
	}
}
