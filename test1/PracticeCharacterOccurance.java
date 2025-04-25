package org.test1;

public class PracticeCharacterOccurance {
	public static void main(String[] args) {
		String s ="Welcome to the testing team";
		char c='e';
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
