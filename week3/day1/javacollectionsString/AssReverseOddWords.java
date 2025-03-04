package week3.day1.javacollectionsString;

public class AssReverseOddWords {

	public static void main(String[] args) {

		String text = "I am a software tester";

		String[] split = text.split(" ");

		for (int i = 0; i < split.length; i++)
		{
			String revWord = " ";
			if (i % 2 != 0) 
			{
				String word = split[i];
				char[] c = word.toCharArray();

				for (int j = c.length - 1; j >= 0; j--) 

					{

						revWord = revWord+ c[j];
					}
				
				System.out.print(revWord + " ");

			} 
			else 
			{
				String evnWord = split[i];

				System.out.print(evnWord + " ");

			}

		}
	}
}

