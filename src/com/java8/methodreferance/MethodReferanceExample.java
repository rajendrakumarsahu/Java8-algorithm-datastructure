package com.java8.methodreferance;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferanceExample {

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public void say() {
		System.out.println("say hello");
	}

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Sayable sayable = MethodReferanceExample::saySomething;
		sayable.say();

		Sayable sayableLambada = () -> System.out.println("HI");
		sayableLambada.say();

		Thread t2 = new Thread(MethodReferanceExample::ThreadStatus);
		t2.start();

		// 2. Method reference to a static method of a class
		Function<Integer, Double> sqrt = (Integer input) -> Math.sqrt(input);
		System.out.println(sqrt.apply(4));
		Function<Integer, Double> sqrtRef = Math::sqrt;
		System.out.println(sqrtRef.apply(4));

		BiFunction<Integer, Integer, Integer> functionLambda = (a, b) -> MethodReferanceExample.add(a, b);
		System.out.println(functionLambda.apply(10, 20));

		BiFunction<Integer, Integer, Integer> function = MethodReferanceExample::add;
		System.out.println(function.apply(10, 20));

		MethodReferanceExample methodReferanceExample = new MethodReferanceExample();
		Sayable sb = methodReferanceExample::say;
		sb.say();

	}

}

interface Sayable {
	void say();
}