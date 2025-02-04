package week1.Assignments;

import java.util.Iterator;

public class IsPrimeNumbe {

	// Prime number - Number which can be divided by 1 or by the same number ex)
	// 2,3,5,7,11,13..
	public static void main(String[] args) {

		int num = 17;
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {

				prime = false;
				break;
			}
		}

		if (prime == true) {
			System.out.println("The given number is a prime number");

		} else
			System.out.println("The given number is not a Prime Number");

	}
}
