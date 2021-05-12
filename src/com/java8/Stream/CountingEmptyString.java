package com.java8.Stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingEmptyString {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		long count = strList.stream().filter(x -> x.isEmpty()).count();

		System.out.println(count);

		long num = strList.stream().filter(x -> x.length() > 3).count();

		System.out.println(num);

		long count1 = strList.stream().filter(x -> x.startsWith("a")).count();

		System.out.println(count1);

		List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());

		System.out.println(filtered);

		List<String> filtered1 = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
		System.out.println(filtered1);

		Function<String, String> fun = x -> x.toUpperCase();
		List<String> filtered2 = strList.stream().map(fun).collect(Collectors.toList());
		System.out.println(filtered2);

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println(distinct);

		// Get count, min, max, sum, and average for numbers
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax());
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());
	}

}
