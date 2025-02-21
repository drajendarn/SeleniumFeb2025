package week1.day4;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// Method1
		int[] num = { 2, 5, 7, 7, 5, 9, 2, 3 };
		Arrays.sort(num);
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == num[i + 1]) {
				System.out.println(num[i]);

			}
			
			/*
			 * // Method2 int[] num2={2, 5, 7, 7, 5, 9, 2, 3}; Arrays.sort(num2); for (int x
			 * = 0; x < num.length-1; x++) { for (int y=x+1;y<num) } if(num[i]==num[i+1]) {
			 * System.out.println(num[i]);
			 * 
			 * 
			 * }
			 */
			 

		}
	}
}