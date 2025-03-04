package week3.day1.javacollectionsString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssSecondlargestList {

	public static void main(String[] args) {

		int[] num = { 3, 2, 11, 4, 6, 7 };
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < num.length; i++) {
			list.add(num[i]);
			Collections.sort(list);

		}
		System.out.println("Array after Sorting : " + list);
		System.out.println("2nd element from the last: " + list.get(num.length - 2));

	}

}
