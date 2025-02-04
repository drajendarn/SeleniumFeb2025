package week1.Assignments;


public class Fibonacci {

	public static void main(String[] args) {
		// The Fibonacci sequence is a series of numbers where each number is the sum of
		// the two numbers that come before it.

		int range = 8;// need to get fibonacci series upto 8 numbers
		int num1 = 0;
		int num2 = 1;

		for (int i = 1; i <= range; i++) 
		{
			System.out.print(num1 + " ");
			int nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
		}
	}

}
