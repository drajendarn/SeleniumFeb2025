package org.test1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Practice2204 {
	public static void main(String[] args) {

		System.out.println("---Program1 - Reverse string with one word----");

		String name1 = "Divya";
		
		char[] c=name1.toCharArray();
		String output="";
		for(int i=c.length-1;i>=0;i--)
		{
			output=output+c[i];
		}
		System.out.println(output);
	

	
	System.out.println("---Program2 - Reverse string with two word----");

	String name2 = "Divya Rajendran";
	String[] s=name2.split(" ");
	String revString="";
	for(String word:s)
	{
		
		String revWord="";
		char[] ch=word.toCharArray();
		
		for(int j=ch.length-1;j>=0;j--)
		{
			revWord=revWord+ch[j];
		}
		revString=revString+revWord+" ";
	}
		System.out.println(revString);
		
		//chare smallLetter to upper and upper to small
		
				String na="dIvyA";
				char[] cha=na.toCharArray();
				String out="";
				for(int k=0;k<cha.length;k++)
				{
					
					if(Character.isUpperCase(cha[k]))
					{
						out=out+Character.toLowerCase(cha[k]);
					}
				
				else
				{
					out=out+Character.toUpperCase(cha[k]);
				}
	}
				System.out.println(out);
				
				
				System.out.println("---Program7A: Print Duplicates ----");

				String[] name7 = { "Divya", "Divya", "harsha", "Barathi","Barathi","Test" };
				
				Set<String> set=new LinkedHashSet<>();
				for(String wo:name7)
				{
				if(!set.add(wo))
				{
					System.out.println(wo);
				}
}
}}