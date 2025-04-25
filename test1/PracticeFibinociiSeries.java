package org.test1;

public class PracticeFibinociiSeries {
	public static void main(String[] args) {
		//0 1 1 2 3 5
		
		int range=8;
		int num1 =0;
		int num2=1;
		System.out.print(num1+ " ");
		System.out.print(num2+ " ");
		for(int i=2;i<=range;i++)
		{
				
		int nextnum=num1+num2;//0+1 1
		num1=num2;
		num2=nextnum;
		System.out.print(nextnum+ " ");
		}
	}

}
