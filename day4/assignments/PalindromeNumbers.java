package week1.day4.assignments;

class PalindromeNumbers {
	public static void main(String[] args) {
		int orgNum = 121;
		int input = 121;
		int output = 0;
		while (input > 0) {
			output = (output * 10) + (input % 10);
			input = input / 10;

		}
		System.out.println("Original number is:" + orgNum);
		System.out.println("Reversed number is:" + output);
		if (orgNum == output) {
			System.out.println("The Given Number is a palindrome");
		} else
			System.out.println("The Given Number is not a palindrome");

	}
}
