package com.java8.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamMinMaxExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 23, 58, 55, 69, 75, 44, 11);
//		Stream<Integer> stream = list.stream();
//		Comparator<Integer> comp = (a, b) -> a.compareTo(b);
//		Optional<Integer> minValue = stream.min(comp);
//		int a = minValue.get();
//		System.out.println(a);

		int minValue = list.stream().min((x, y) -> x.compareTo(y)).get();

		System.out.println(minValue);

	}

}
