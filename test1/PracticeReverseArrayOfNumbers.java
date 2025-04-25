package org.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeReverseArrayOfNumbers {

	public static void main(String[] args) {
		/*
		 * // using For loop
		 * 
		 * int[] arr= {1,2,3,4,5}; int l=arr.length; int[] b=new int[l];
		 * 
		 * for(int i=0;i<l;i++) { b[i]=arr[l-1-i]; } for(Integer n:b) {
		 * System.out.print(n+ " ");
		 * 
		 * }
		 */
// using Collectons
		Integer[] arr = { 1, 2, 3, 4, 5 };// we must use Integer[] not int[]
		List<Integer> list = new ArrayList<>(Arrays.asList(arr)); // Arrays.asList(arr) - used to add arrays into list

		Collections.reverse(list);
		for (Integer n : list) {
			System.out.print(n);
			;
		}

	}

}
