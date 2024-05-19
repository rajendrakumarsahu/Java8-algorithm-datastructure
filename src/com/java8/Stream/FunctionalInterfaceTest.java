package com.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfaceTest {
	public static void main(String args[]) {
		// create anonymous inner class object
		new Thread(() -> {
			System.out.println("New thread created");
		}).start();

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());

		squaresList.stream().forEach(System.out::println);
	}

}
