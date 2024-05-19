package com.string.example;

import java.io.InputStream;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharacterFrequencyJava8 {
	public static void main(String[] args) {
		String str = "hello world";
		Map<Character, Long> frequencyMap = calculateCharacterFrequency(str);

		System.out.println("Character frequency in \"" + str + "\":");
		frequencyMap.forEach((character, frequency) -> System.out.println(character + ": " + frequency));
		// different approches

		InputStream stream = (InputStream) str.chars();

		Stream<Character> characterStream = ((IntStream) stream).mapToObj(c -> (char) c);

		Map<Character, Long> map = characterStream
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
	}

	public static Map<Character, Long> calculateCharacterFrequency(String str) {
		return str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

}
