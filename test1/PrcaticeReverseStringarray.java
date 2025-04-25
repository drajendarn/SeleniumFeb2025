package org.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrcaticeReverseStringarray {
	
	public static void main(String[] args) {

		String[] str = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		System.out.println("Original String : " + Arrays.toString(str));

		// sort
		Arrays.sort(str);

		// code to reverse each string in the given array
		System.out.print("After Reversed : ");
		for (String string : str) {
			String output = " ";
			for (int i = string.length() - 1; i >= 0; i--)

			{
				output = output + string.charAt(i);

			}
			System.out.print(output);

		}

	}

}
