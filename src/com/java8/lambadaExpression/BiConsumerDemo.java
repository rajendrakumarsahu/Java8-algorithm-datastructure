package com.java8.lambadaExpression;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		BiConsumer<Integer, Integer> bicon = (a, b) -> {
			System.out.println(a + b);
		};
		bicon.accept(20, 30);

	}

}
