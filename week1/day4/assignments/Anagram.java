package week1.day4.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		char[] c1 = text1.toCharArray();
		char[] c2 = text2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		

		if (text1.length() != text2.length()) 
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		
		}

		if (Arrays.equals(c1, c2)) {
			System.out.println("The given strings are Anagram");
		} else
			System.out.println("The given strings are not Anagram");

	}
}
