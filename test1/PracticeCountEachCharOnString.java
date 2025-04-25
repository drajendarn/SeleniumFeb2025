package org.test1;

import java.util.HashMap;
//import java.util.Map;

public class PracticeCountEachCharOnString {

	public static void charOccurance(String name) {
		char[] strArry = name.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (char c : strArry) {
			if (charMap.containsKey(c))
				charMap.put(c, charMap.get(c) + 1);// increases count if occ exist
			else
				charMap.put(c, 1);// set count value to 1 if there are no occurances }
		}
		System.out.println(name + ":" + charMap);
	}

	public static void main(String[] args) {

		String name = "welcome to java";
		charOccurance(name);

	}
}
