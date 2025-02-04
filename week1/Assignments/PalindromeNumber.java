package week1.Assignments;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		// Palindrome - number reads the same backward and forward ex) 121, 12321

		int num = 12321;
		int originalNumer = num;
		int revNumber = 0;
		while (num > 0) // Using for loop : for (;num!=0;)
		{
			revNumber = (revNumber * 10) + (num % 10);
			num = num / 10;
		}
		System.out.println("Reversed number : " + revNumber);

		if (originalNumer == revNumber)
		{
			System.out.println("The given number " + originalNumer + " is a palindrome");
		} 
		else
			System.out.println("The given number " + originalNumer + " is not a palindrome");

	}

}
