package org.test1;

import java.util.Arrays;

public class PracticeReverseEachWordInString {
	public static void main(String[] args) {
		String s = "Welcome to Java";
		String[] words = s.split(" "); // Splits string into each word based on space
		System.out.println(Arrays.toString(words));// To Print String Array [Welcome,to,Java]
		String revString = "";
		for (String w : words)// takes each word
		{
			
			String revWord = "";
			for (int i = w.length() - 1; i >= 0; i--)// apply reverse logic
			{

				revWord = revWord + w.charAt(i);
			}
			revString = revString + revWord + " ";

		}
		System.out.println(revString);
	}

}
