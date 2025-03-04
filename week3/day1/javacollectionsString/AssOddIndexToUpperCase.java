package week3.day1.javacollectionsString;

public class AssOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test="changeme";
		char[] c=test.toCharArray();
		String output="";
		
		for(int i=0;i<c.length;i++)
		{
			if(i%2!=0)
			{
				output=output+Character.toUpperCase(c[i]);
			}
			
			else
				output=output+c[i];
		}
		System.out.println(output);
	}
}
