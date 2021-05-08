package com.java8.Stream;

import java.util.ArrayList;
import java.util.List;

public class Test {
	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 12; i++) {
			list.add(i);
		}
		System.out.println(list);

		System.out.println(sumStream(list));

	}

}
