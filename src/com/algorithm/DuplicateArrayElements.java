package com.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateArrayElements {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(new Integer[] { 1, 2, 1, 3, 4, 4 });

		// findDuplicates(numbers);
		// findDuplicates1(numbers);
		// findDuplicates2(numbers);
		// findDuplicates3(numbers);
		findDuplicates4(numbers);

	}

	private static void findDuplicates4(List<Integer> numbers) {
		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (Integer num : numbers) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		map.forEach((k, v) -> System.out.println(k + "===" + v));

	}

	private static void findDuplicates3(List<Integer> numbers) {
		Set<Integer> duplicated = numbers.stream().filter(n -> numbers.stream().filter(x -> x == n).count() > 1)
				.collect(Collectors.toSet());

	}

	/*
	 * 
	 * good solution
	 */
	private static void findDuplicates2(List<Integer> numbers) {
		Set<Integer> duplicatedNumbersRemovedSet = new HashSet<>();
		Set<Integer> duplicatedNumbersSet = numbers.stream().filter(n -> !duplicatedNumbersRemovedSet.add(n))
				.collect(Collectors.toSet());
		duplicatedNumbersSet.forEach(System.out::println);

	}

	private static void findDuplicates1(List<Integer> numbers) {
		List list = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(p -> p.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		list.forEach(System.out::println);

	}

	private static void findDuplicates(List<Integer> numbers) {
		Set<Integer> collect = numbers.stream().filter(i -> Collections.frequency(numbers, i) > 1)
				.collect(Collectors.toSet());

		collect.forEach(System.out::println);

	}

}
