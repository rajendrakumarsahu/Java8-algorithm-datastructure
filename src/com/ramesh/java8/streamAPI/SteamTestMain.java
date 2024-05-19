package com.ramesh.java8.streamAPI;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SteamTestMain {

	public static void main(String[] args) {
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		// streamIterated.forEach(System.out::println);

		IntStream intStream = IntStream.range(1, 3);
		LongStream longStream = LongStream.rangeClosed(1, 3);
		// intStream.forEach(System.out::println);
		// longStream.forEach(System.out::println);

		Random random = new Random();
		DoubleStream doubleStream = random.doubles(3);

		doubleStream.forEach(System.out::println);

	}

}
