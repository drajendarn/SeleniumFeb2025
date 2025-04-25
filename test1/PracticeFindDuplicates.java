package org.test1;

public class PracticeFindDuplicates {
	public static void main(String[] args) {
		int[] arr= {1,2,1,4,5,1,5,6};
		
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
			
	}
	

}
