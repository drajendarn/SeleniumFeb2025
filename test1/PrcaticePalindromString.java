package org.test1;

public class PrcaticePalindromString {

	public static void main(String[] args) {

		String s = "madam";
		String original = s;
		String rev = "";
		int len = s.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("The reversed String is:" + rev);

		if (original.equals(rev))

			System.out.println("The Given string is a palindrome");

	}

	}
