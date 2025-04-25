package org.test1;

import java.util.Arrays;
import java.util.Iterator;

public class PracticeStringUppercase {
	public static void main(String[] args) {
		String s="Divya rajendran";
		String[] sr=s.split(" ");
		String ans=" ";
		System.out.println(Arrays.toString(sr));
		for (String w:sr)
		{
		String word=w.substring(0,1)+w.substring(1,2).toUpperCase()+w.substring(2,w.length());
		System.out.print(ans+word);
		
		//substring(0,1)--> Print first char
		//substring(1,2)--> Print second char
		
			
		
		}
		
	}
}
