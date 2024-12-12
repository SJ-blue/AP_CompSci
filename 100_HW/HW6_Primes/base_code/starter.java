/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
  public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int value = sc.nextInt();
    printPrimes(value);
  }
  public static boolean checkPrime(int num) {
    int num1 = 2;
    if (num == 1) {
        return false;
    }
    while (num1 < Math.sqrt(num) + 1) {
      if (num % num1 == 0) {
        return false;
      }
      num1++;
    }
    return true;
  }
	public static void printPrimes(int value) {
		int i = 1;
		while (i <= value) {
      if (checkPrime(i)) {
        System.out.println(i);
      }
      i++;
	  }
  }
}
