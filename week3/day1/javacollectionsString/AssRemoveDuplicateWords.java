package week3.day1.javacollectionsString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AssRemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text="We learn java basics as part of java sessions in java week1";
		String[] split=text.split(" ");
		System.out.println(Arrays.toString(split));//To print string array
					
		Set<String> set=new LinkedHashSet<>();
		for (String s : split) 
		{
			set.add(s);
						
		}
		String output = String.join(" ", set);//To Convert set to a string with elements separated by a space
		System.out.println("After Removing Duplicates:" + output );
	}
}
