/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first and last name: ");
        String sentence = sc.nextLine();
        int space = sentence.indexOf(" ");
        String word = sentence.substring(space + 1);
        System.out.print(word);
    }
}
