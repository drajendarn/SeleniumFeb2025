package org.test1;

//import java.util.Iterator;

public class PracticeReverseString {
public static void main(String[] args) {
	String s="Divya";
	String rev=" ";
	/* Using to CharArray
	 * char[] c=s.toCharArray(); 
	 * int l=c.length; 
	 * for(int i=l-1;i>=0;i--) {
	 * rev=rev+c[i]; } 
	 * System.out.println(rev);
	 */
	// using charAt
	int l=s.length();
	for(int i=l-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
				
	}
	System.out.println(rev);
}
}
