package week1.day4.assignments;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		String chgString = "";
		char[] c = test.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if (i % 2 != 0) 
			{
				chgString = chgString + Character.toUpperCase(c[i]);
			} 
			else
			{
				chgString = chgString + c[i];
			}

		}
		
		System.out.println("Changed String is: " + chgString);
	}

}
