package com.java8.FunctionalInterface;

@FunctionalInterface
public interface MyFirstFunctionalInterface {
	public void firstWork();

	default void doSomeMoreWork1() {
		System.out.println("My default doSomeMoreWork1");
	}

	default void doSomeMoreWork2() {
		System.out.println("My default doSomeMoreWork1");
	}
}
