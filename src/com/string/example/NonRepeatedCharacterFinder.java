package com.string.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeatedCharacterFinder {

	public static void main(String[] args) {
		String text = "ava spring microservice";
		char result = firstNonRepeatedCharacter1(text);
		if (result != '\0') {
			System.out.println("The first non-repeated character is: " + result);
		} else {
			System.out.println("All characters are repeated.");
		}

	}

	public static char firstNonRepeatedCharacter(String input) {
		// Step 1: Build a frequency count for each character
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		for (char ch : input.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
		}

		// Step 2: Find the first character with a count of 1
		for (char ch : input.toCharArray()) {
			if (charCount.get(ch) == 1) {
				return ch;
			}
		}

		return '\0'; // return null character if all characters are repeated
	}

	public static char firstNonRepeatedCharacter1(String input) {

		input.chars().collect(Collectors.groupingBy(Function.identity(),
				LinkedHashMap::new,
				Collectors.counting())).

		
		return '\0'; // return null character if all characters are repeated
	}
}
