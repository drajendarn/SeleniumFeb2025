package week3.day1.javacollectionsString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssSortingReverseStringUsingCollection {
	public static void main(String[] args) {
		
		String[] str= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		System.out.println("Original String : " + Arrays.toString(str));
		
		List<String> list = new ArrayList<>();

		// add string of array values into list
		for (String s : str) 
		{
			list.add(s);
		}
		
		// sort 
		Collections.sort(list);
		
		System.out.println("After Sorting : " + list);
		
		// code to reverse each string in the given array
		System.out.print ("After Reversed : ");
		for (String string : list)
		{
			String output=" ";
			for (int i = string.length()-1; i >=0; i--) 
				
			{
				output=output+string.charAt(i);
				
			}
			System.out.print(output);
					
		}
		
		
	}

}
