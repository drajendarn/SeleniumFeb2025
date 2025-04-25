package org.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class practice {
	
	public static void main(String[] args)
	
	{
		System.out.println("---Program1 - Reverse string with one word----");

		String name1 = "Divya";
		
		char[] c=name1.toCharArray();
		String revString="";
		for(int i=c.length-1;i>=0;i--)
		{
			revString=revString+c[i];
		}
		System.out.println(revString);
		System.out.println("------------------------------------------------");
		
		System.out.println("---Program2 - Reverse String with multiple words----");
		String name2="Divya Rajendran";
		String[] word=name2.split(" ");
		String revStringWord="";
		for(String eachWord:word)
		{
			String revWord="";
			char[] c1=eachWord.toCharArray();
			for(int a=c1.length-1;a>=0;a--)
			{
				revWord=revWord+c1[a];
			}
			revStringWord=revStringWord+revWord+" ";
		}
		System.out.println(revStringWord);
		
		System.out.println("------------------------------------------------");

		System.out.println("---Program3 - Reverse String Array----");

		String[] name3 = { "Divya Rajendran", "Harsha", "Rakshahini", "Barathi" };
		
		String revArray="";
		for(String eachArray:name3)
		{
			//System.out.println(eachArray);
			
			String[] split=eachArray.split(" ");// to split the array has two words
			
			for(String splitword:split)
			{
				String revArrayWord="";
			for(int b=splitword.length()-1;b>=0;b--)
			{
				revArrayWord=revArrayWord+splitword.charAt(b);
			}
			revArray=revArray+revArrayWord+" ";
			/*
			 * String revArrayWord=""; String[] split=eachArray.split(" "); char[]
			 * c2=split.toCharArray(); for(int b=c2.length-1;b)
			 */
		}
		}
		System.out.println(revArray);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("---Program3a - Reverse a String completely from last to first----");// this is incorrect the entire 

		String name3a =  "Divya Rajendran";
		
		String revArraya="";
		
			for(int ba=name3a.length()-1;ba>=0;ba--)
			{
			
			revArraya=revArraya+name3a.charAt(ba);
			/*
			 * String revArrayWord=""; String[] split=eachArray.split(" "); char[]
			 * c2=split.toCharArray(); for(int b=c2.length-1;b)
			 */
		}
		System.out.println(revArraya);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("---Program4 change second char to uppercase----");

		String name4 = "divyaa rajendran";
		
		String[] split1=name4.split(" ");
		String upperCase="";
		for(String word1:split1)
		{
			upperCase=upperCase+word1.substring(0,1)+word1.substring(1,2).toUpperCase()+word1.substring(2,word1.length())+" ";
		}
		System.out.println(upperCase);

		System.out.println("---Program5: change alternate chars to uppercase in a given string ----");

		String name5 = "divyaa rajendran";
		
		String altUpper="";
		for(int d=0;d<name5.length();d++)
		{
			if(d%2==0)
			{
				altUpper=altUpper+Character.toUpperCase(name5.charAt(d));
			}
			else
				altUpper=altUpper+name5.charAt(d);
		}
		System.out.println(altUpper);
		
		System.out.println("------------------------------------------------");

		System.out.println("---Program6: change alternate chars to uppercase in a given string of words ----");

		String name6 = "divya rajendran";
		String[] split6=name6.split(" ");
		String output6="";
        for(String word6:split6)
        {
        	String uppWord="";
        	for(int e=0;e<word6.length();e++)
        	{
        		if(e%2==0)
        		{
        			uppWord=uppWord+Character.toUpperCase(word6.charAt(e));
        		}
        		else
        			uppWord=uppWord+word6.charAt(e);
        	}
        	output6=output6+uppWord+" ";
        }
		System.out.println(output6);
		
		System.out.println("------------------------------------------------");
		System.out.println("---Program7A: Print Duplicates ----");

		String[] name7 = { "Divya", "Divya", "harsha", "Barathi" };

		Set<String> set = new LinkedHashSet<String>();
		for (String setWord : name7) {
			if (!set.add(setWord)) {
				System.out.println(setWord);
			}
		}
		
		
		System.out.println("------------------------------------------------");
		System.out.println("---Program7: remove duplicate from the Given string and print the remaining ----");
		
		String[] name71={"Divya","Divya","harsha","Barathi"};
		
		Set<String> set1=new LinkedHashSet<String>();
		for(String setWord1:name71)
		{
		set1.add(setWord1);
		}
		System.out.println(set1);
		
System.out.println("---Program8: remove duplicate char in a string ----");
		
		String name8="DivyaDivyaxyz";
		char[] c8=name8.toCharArray();
		String setoutput="";
		Set<Character> setc=new LinkedHashSet<Character>();
		for(Character sc:c8)
		{
			setc.add(sc);
			//setoutput=setoutput+setc;
		}
		System.out.println(setc.toString());
		
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
		
		System.out.println("---Find Missing elements-----");
		
		int[] num = { 1, 2, 3, 4, 10, 6, 8 };
		Arrays.sort(num);
		int firstNum=num[0];
		int lastNum=num[num.length-1];
		int count1=0;
		for(int i=firstNum;i<lastNum;i++)
		{
			if(num[count1]==i)
			{
				count1++;
			}
			else
				System.out.println(i);
		}
		
System.out.println("---Find Missing elements using List-----");
		
		int[] num11 = { 1, 2, 3, 4, 10, 6, 8 };
		Arrays.sort(num11);
		List<Integer> list11=new ArrayList<>();
		for(Integer nums:num11)
		{
		list11.add(nums);
				}
		Collections.sort(list11);
		int firstNum1=num11[0];
		int lastNum1=num11[num11.length-1];
		for(int aa=firstNum1;aa<lastNum1;aa++)
		{
			if(!list11.add(aa))
			{
				System.out.println(aa);
			}
		
	}

		System.out.println("---Char occurance in a given string");
		String s="Divyaaa rajendran";
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		for(Character eachChar:ch)
		{
			if(map.containsKey(eachChar))
			{
				map.put(eachChar, map.get(eachChar)+1);
			}
			else
				map.put(eachChar, 1);
		}
System.out.println(map);
	}
}

