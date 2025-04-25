package org.test1;

public class PracticePalindromeNumber {
	public static void main(String[] args) {
		int orgNum = 12121;
		int num = 12121;
		int rev = 0;
		while (num > 0) {
			rev = (rev * 10) + (num % 10);
			num = num / 10;

		}
		System.out.println(rev);
		if (rev == orgNum) {
			System.out.println("The given number is Palindrome");
		} else
			System.out.println("Given number is not a palindrome");
	}
}
