package com.java8.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThirdHeightNoArrays {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 15, 31, 89);
		Collections.reverse(list);
		// list.forEach(System.out::println);

		// list.stream().skip(2).limit(1).forEach(System.out::println);

		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

}
