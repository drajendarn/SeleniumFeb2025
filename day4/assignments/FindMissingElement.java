package week1.day4.assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 2, 8, 6, 7, 10, 15 };
		Arrays.sort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
		int n = arr[arr.length - 1]; //To get max element in the given array
		int count = 0;

		for (int i = arr[0]; i < n; i++) {
			if (arr[count] == i) {
				count++;

			} else
				System.out.println("Missing Numbers are : " + i);
		}

	}

}
