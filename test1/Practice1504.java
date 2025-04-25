package org.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Practice1504 {

public static void main(String[] args)
	
	{
		System.out.println("---Program1 - Reverse string with one word----");

		String name1 = "Divya";
		
		char[] c=name1.toCharArray();
		String output1="";
		for(int i=c.length-1;i>=0;i--)
		{
			output1=output1+c[i];
		}
		
		System.out.println(output1);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("---Program2 - Reverse String with multiple words----");

		String name2="Divya Rajendran Barathi";
		
		String[] split=name2.split(" ");
		String output2="";
		for(String word:split)
		{
			String revWord="";
			char[] c1=word.toCharArray();
			for(int j=c1.length-1;j>=0;j--)
			{
				revWord=revWord+c1[j];
			}
			output2=output2+revWord+" ";
		}
		
		System.out.println(output2);
		
		System.out.println("------------------------------------------------");

		System.out.println("---Program3 - Reverse String Array----");
		String[] name3 = { "Divya Rajendran", "Harsha", "Rakshahini", "Barathi" };
		
		String output3="";
		for(String eachString:name3)
		{
			String[] splitWord=eachString.split(" ");
			for(String eachWord: splitWord)
			{
			
			String revWo=" ";
			for(int k=eachWord.length()-1;k>=0;k--)
			{
				revWo=revWo+eachWord.charAt(k);
			}
			output3=output3+revWo+" ";
		}
		}
		System.out.println(output3);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("---Program3a - Reverse a String completely from last to first----");// this is incorrect the entire 

		String name3a =  "Divya Rajendran";
		String output4="";
		for(int l=name3a.length()-1;l>=0;l--)
		{
			output4=output4+name3a.charAt(l);
		}
		
		System.out.println(output4);
		
		
		System.out.println("------------------------------------------------");
		
		System.out.println("---Program4 change second char to uppercase----");

		String name4 = "divyaa rajendran";
		String[] s=name4.split(" ");
		String output5=" ";
		for(String w:s)
		{
			char[] c2=w.toCharArray();
			for(int m=0;m<c2.length;m++)
			{
			if( m==1)
			{
				output5=output5+Character.toUpperCase(c2[m]);
			}
			else
				output5=output5+c2[m];
			}
			 output5 = output5 + " ";
		}
		System.out.println(output5.trim());
		
		//Method2
		String output6="";
		for(String wo:s)
		{
			output6=output6+wo.substring(0,1)+wo.substring(1,2).toUpperCase()+wo.substring(2,wo.length())+" ";
		}

		System.out.println(output6);
		System.out.println("---Program5: change alternate chars to uppercase in a given string ----");
		String n="divya";
		char[] ch=n.toCharArray();
		String output8="";
		for(int n1=0;n1<ch.length;n1++)
		{
			if(n1%2==0)
			{
				output8=output8+Character.toUpperCase(ch[n1]);
						}
			
			else
				output8=output8+ch[n1];
		}
		System.out.println(output8);
		
		//chare smallLetter to upper and upper to small
		
		String na="dIvyA";
		char[] cha=na.toCharArray();
		String output9="";
		for(int n11=0;n11<cha.length;n11++)
		{
			if(Character.isUpperCase(cha[n11]))
			{
				output9=output9+Character.toLowerCase(cha[n11]);
						}
			
			else
				output9=output9+Character.toUpperCase(cha[n11]);
		}
		System.out.println(output9);
		
		System.out.println("------------------------------------------------");

		System.out.println("---Program6: change alternate chars to uppercase in a given string of words ----");

		String name5 = "divyaa rajendran";
		String[] s5=name5.split(" ");
		String output7=" ";
		for(String w5:s5)
		{
			char[] c5=w5.toCharArray();
			for(int m5=0;m5<c5.length;m5++)
			{
			if( m5%2==0)
			{
				output7=output7+Character.toUpperCase(c5[m5]);
			}
			else
				output7=output7+c5[m5];
			}
			output7 = output7 + " ";
		}
		System.out.println(output7.trim());
		
		
		System.out.println("------------------------------------------------");
		System.out.println("---Program7A: Print Duplicates ----");

		String[] name7 = { "Divya", "Divya", "harsha", "Barathi","Barathi","Test" };
		
		Set<String> set=new LinkedHashSet<String>();
		for(String se:name7)
		{
			if(!set.add(se))
			{
				System.out.println( se);
			}
		}

		
		System.out.println("---Program7: remove duplicate from the Given string and print the remaining ----");
		
		String[] name71={ "Divya", "Divya", "harsha", "Barathi","Barathi","Test" };

		Set<String> set1=new LinkedHashSet<>();
		for(String se1:name71)
		{
			if(set1.add(se1))
			{
				System.out.println( se1);
			}
		}
		
		
System.out.println("---Program8: remove duplicate char in a string ----");
		
		String name8="DivyaDivyaxyz";
		char[] charr=name8.toCharArray();
		Set<Character> set2=new LinkedHashSet<>();
		for(Character cs:charr)
		{
			set2.add(cs);
			
		}
		System.out.println(set2);
		
		
System.out.println("---Program9: character Occurance in a string ----");
		
		
		
System.out.println("---Find Missing elements-----");

int[] nums = { 1, 2, 3, 4, 10, 6, 8 };	
Arrays.sort(nums);
int first=nums[0];
int last=nums[nums.length-1];

int count=0;
for(int d=first;d<last;d++)
{
	if(nums[count]==d)
	{
		
		count++;
	}
	else
		System.out.println(d);
}
		
		
		
System.out.println("---Find Missing elements using List-----");
		
		

System.out.println("---Char occurance in a given string");
String sa="Divyaaa rajendran";

char[] ca=sa.toCharArray();

HashMap<Character, Integer> map=new HashMap<Character, Integer>();

for(Character cf:ca)
{
	if(map.containsKey(cf))
	{
		map.put(cf, map.get(cf)+1);
	}
	else
		map.put(cf, 1);
}
System.out.println(map);



System.out.println("---Reverse Array of Number");

int[] a= {1,2,5,6,8};
int l=a.length;
int[] b=new int[l];
for(int e=0;e<l;e++)
{
	b[e]=a[l-1-e];
}

for(Integer nu:b) {
	 System.out.print(nu+ " ");
	}

System.out.println("---Reverse Number--");
 int numb=5213;
 int rev=0;
 while(numb>0)
 {
	 rev=(rev*10)+(numb%10);
	 numb=numb/10;
 }
System.out.println(rev);
	}

}

