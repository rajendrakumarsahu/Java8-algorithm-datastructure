package com.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LambadaTestings {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 5, 45, 22, 33, 78);
		Stream<Integer> stream = list.stream().sorted(Comparator.reverseOrder());
		stream.forEach(s -> System.out.println(s));
	}

}
