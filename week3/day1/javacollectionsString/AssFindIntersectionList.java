package week3.day1.javacollectionsString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AssFindIntersectionList {

	public static void main(String[] args) {

		int[] num1 = { 3, 2, 11, 4, 6, 7 };
		int[] num2 = { 1, 2, 8, 4, 9, 7 };

		Arrays.sort(num1);
		Arrays.sort(num2);

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < num1.length; i++) {
			list.add(num1[i]);
			for (int j = 0; j < num2.length; j++) {
				list.add(num2[j]);

				if (num1[i] == num2[j]) {
					System.out.println(num1[i]);
				}

			}

		}

	}
}
