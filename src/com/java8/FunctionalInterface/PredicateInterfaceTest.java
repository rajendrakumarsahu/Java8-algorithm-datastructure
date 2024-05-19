package com.java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceTest {

	public static void main(String[] args) {

		Predicate<Integer> pre = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		boolean b = pre.test(88);
		System.out.println(b);

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Predicate<Integer> predicate2 = (x) -> x > 5;
		Predicate<Integer> predicate3 = (x) -> x < 8;
		list1.stream().filter(predicate2.and(predicate3)).collect(Collectors.toList()).forEach(System.out::println);
	}

}

//public interface Predicate<T> {
//	boolean test(T t);
//}
