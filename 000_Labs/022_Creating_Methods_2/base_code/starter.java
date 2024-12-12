/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y) {
		int answer = 1;
		int i = 1;
		while (i <= y) {
			answer = answer * x;
			i++;
		}
		return answer;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter another number: ");
		int num2 = sc.nextInt();
		System.out.println(num1 + " to the power of " + num2 + " is " + pow(num1, num2));
	}
}
