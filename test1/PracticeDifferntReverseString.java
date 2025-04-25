package org.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeDifferntReverseString {

	public static void main(String[] args) {

		System.out.println("---Program1 - Reverse string with one word----");

		String name1 = "Divya";
		char[] c = name1.toCharArray();
		String output = "";
		for (int i = c.length - 1; i >= 0; i--) {
			output = output + c[i];
		}

		System.out.println("Reverse String :" + output);

		System.out.println("---Program2 - Reverse String with multiple words----");
		String name2 = "Divya Rajendran";
		String[] split = name2.split(" ");
		String revString = "";
		for (String word : split) {
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}
			revString = revWord + " " + revString;
		}

		System.out.println(revString);

		System.out.println("---Program3 - Reverse String Array----");

		String[] name3 = { "Divya Rajendran", "Harsha", "Rakshahini", "Barathi" };
		String output1 = "";
		for (String str : name3) {
			String revStringArr = "";
			for (int y = str.length() - 1; y >= 0; y--) {
				revStringArr = revStringArr + str.charAt(y);
			}

			output1 = output1 + " " + revStringArr;
		}
		
		System.out.println(output1);

		System.out.println("---Program4 change second char to uppercase----");

		String name4 = "divya rajendran";
		String[] split4 = name4.split(" ");
		String ans = "";
		for (String s : split4) {
			String upWord = s.substring(0, 1) + s.substring(1, 2).toUpperCase() + s.substring(2, s.length());
			// String
			// word=w.substring(0,1)+w.substring(1,2).toUpperCase()+w.substring(1,w.length());
			ans = ans + " " + upWord;
		}
		System.out.println(ans);

		System.out.println("---Program5: change alternate chars to uppercase in a given string ----");

		String name5 = "divya";
		char[] a = name5.toCharArray();
		String prog5 = "";
		for (int j = 0; j < a.length; j++) {
			if (j % 2 == 0) {
				prog5 = prog5 + Character.toUpperCase(c[j]);
			}

			else
				prog5 = prog5 + c[j];
		}
		System.out.println(prog5);

		System.out.println("---Program6: change alternate chars to uppercase in a given string of words ----");

		String name6 = "divya rajendran";
		String[] split6 = name6.split(" ");
		String output6 = "";
		for (String p6 : split6) {
			String prog6 = "";
			char[] c6 = p6.toCharArray();
			for (int k = 0; k < c6.length; k++) {
				if (k % 2 == 0) {
					prog6 = prog6 + Character.toUpperCase(c6[k]);
				}

				else
					prog6 = prog6 + c6[k];
			}
			output6 = output6 + " " + prog6;

		}
		System.out.println(output6);
		
		System.out.println("---Program7: remove duplicate string ----");
		
		String[] name7={"Divya","Divya"};
		//char[] c7=name7.toCharArray();
		List<String> list=new ArrayList<>();
		
		for(int z=0;z<name7.length;z++)
		{
			list.add(name7[z]);
		}
		System.out.println(list);
		
		Set<String> set=new HashSet<>(list);
		for(String p7:set)
		{
			System.out.println(p7);
			
 		}
		
System.out.println("---Program8: remove duplicate char in a string ----");
		
		String name8="DivyaDivyaxyz";
		char[] c8=name8.toCharArray();
		List<Character> list8=new ArrayList<>();
		
		for(int z=0;z<c8.length;z++)
		{
			list8.add(c8[z]);
		}
		System.out.println(list8);
		
		Set<Character> set8=new HashSet<>(list8);
		for(Character p8:set8)
		{
			System.out.print("After Removing duplicate chars : " + p8);
			
 		}
		
System.out.println("---Program9: character Occurance in a string ----");
		
		String name9="DivyaDivyaxyz";
		String name91="DivyaDivyaxyz";
		char[] c9=name9.toCharArray();
		char[] c91=name91.toCharArray();
		List<Character> list9=new ArrayList<>();
		int count=0;
		for(int z=0;z<c9.length;z++)
		{
			list9.add(c9[z]);
			if(Arrays.equals(c9,c91))
			{
				count++;
			}
		}
		System.out.println(list9);
		
	
		
	}
	

}
