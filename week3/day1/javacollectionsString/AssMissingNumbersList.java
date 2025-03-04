package week3.day1.javacollectionsString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssMissingNumbersList {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 10, 6, 8 };

		List<Integer> list = new ArrayList<>();

		for (Integer i : num) {
			list.add(i);
		}

		Collections.sort(list);

		int firstNum = num[0];
		int lastNum = num[num.length - 1];

		for (int i = firstNum; i <= lastNum; i++) {

			if (!list.contains(i)) {
				System.out.println("Missing Numbers are : " + i);
			}

		}

	}

}
