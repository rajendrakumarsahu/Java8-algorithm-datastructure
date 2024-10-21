package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingCharecterElementsString {

	public static void main(String[] args) {
		String st = "abcdefgabc";
		// getFirstRepeateCharApproch1(st);
		// getFirstRepeateCharApproch2(st);
		// getFirstRepeateCharApproch3(st);
		// getFirstRepeateCharApproch4(st);
		List<String> names = Arrays.asList("Java", "Spring", "JPA", "Java", "Cloud", "JPA");

		Map<String, Long> count = names.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		Map<String, Long> duplicates = count.entrySet().stream().filter(e -> e.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println("Duplicates counts:");

		duplicates.forEach((key, value) -> System.out.println(key + " -> " + value));

		Optional<String> result = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).findFirst();

		// Optional<Employee> employee = list.stream().sorted((x,y) ->
		// y.salary.compareTo(x.salary)).skip(1).findFirst();

	}

	private static void getFirstRepeateCharApproch4(String st) {
		char[] chrs = st.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char ch : chrs) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		map.forEach((k, v) -> System.out.println(k + "=" + v));

	}

	private static void getFirstRepeateCharApproch3(String st) {

		Set<Integer> set = new HashSet<>();
		st.chars().filter(data -> !set.add(data)).forEach(data -> System.out.println("duplicates " + data));
	}

	static void getFirstRepeateCharApproch1(String st) {
		Set<Integer> set = new LinkedHashSet<>();
		int it = st.chars().filter(i -> !set.add(i)).findFirst().getAsInt();
		System.out.println((char) it);
	}

	static void getFirstRepeateCharApproch2(String st) {
		List<Character> list = new ArrayList<>();
		for (char c : st.toCharArray()) {
			list.add(c);
		}
		Set<Character> items = new LinkedHashSet<>();
		Set<Character> set = list.stream().filter(n -> !items.add(n)).collect(Collectors.toSet());
		set.forEach(System.out::println);
	}
}
