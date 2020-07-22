package com.java8.examples;

@FunctionalInterface
public interface InterFace1 {
	void method1(String str);

	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}
}
