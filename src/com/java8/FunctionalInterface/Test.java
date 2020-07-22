package com.java8.FunctionalInterface;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Test {
	// Traditional approach
	private static boolean isPrime(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("the value of i::" + i);
				return false;
			}
		}
		return true;
	}

	// Declarative approach
	private static boolean isPrimeD(int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
	}

	private static boolean isPrimeAD(int number) {
		IntPredicate isDivisible = index -> number % index == 0;

		return number > 1 && IntStream.range(2, number).noneMatch(isDivisible);
	}

	public static void main(String... strings) {
		IntPredicate isDivisible = index -> 10 % index == 0;
		System.out.println(isPrimeD(9));
		IntStream is = IntStream.range(0, 10);
		System.out.println(is.count());
		System.out.println(is.anyMatch(isDivisible));
		System.out.println(is.count());
		System.out.println(is.count());
		System.out.println(is.count());
		System.out.println(is.count());
	}
}
