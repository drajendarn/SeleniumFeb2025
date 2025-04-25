package org.test1;

public class PracticePrimenumbers {
	public static void main(String[] args) {
		int num = 17;
		boolean prime = true;
		for (int i = 2; i < num; i++)

		{
			if (num % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime == true) {
			System.out.println("The given number is prime number");

		} else
			System.out.println("The given number is not a prime number");

	}
}
