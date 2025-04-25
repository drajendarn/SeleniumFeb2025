package org.test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeFindDuplicatesListSet {

	public static void duplicates(int[] arr)
	{
		List<Integer> list= new ArrayList<>();
		for(int i=0;i<arr.length;i++)
			list.add(arr[i]);
		System.out.println(list);
		
		Set<Integer> s=new HashSet<>();
		for(int name:list)
		{
			
				if(s.add(name)==false)
					System.out.println("duplicate values are" +name);
		{
			
		}
		
	}}
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,2,3,5,4};
		duplicates(arr);
	}
}
