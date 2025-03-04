package week3.day1.javacollectionsString;

import java.util.Arrays;

public class AssAnagram {

	public void anagram(String text1, String text2) {
		char[] c1 = text1.toCharArray();
		char[] c2 = text2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));

		if (c1.length != c2.length) {
			System.out.println("The given string is not a Anagram as lengths of both strings are not equal");

		}

		else if (Arrays.equals(c1,c2)) {
			System.out.println("The given string is Anagram");
		} else
			System.out.println("The given string is not an Anagram");

	}

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";

		AssAnagram a = new AssAnagram();
		a.anagram(text1, text2);
	}

}
