package com.java8.FunctionalInterface;

import java.util.function.Function;

public class FunctionInterfaceTest {

	public static void main(String[] args) {

		Function<String, Integer> fun = (t) -> t.length();

		System.out.println(fun.apply("Rajendra"));
	}

}

//@FunctionalInterface
//public interface Function<T, R> {
//	R apply(T t);
//}