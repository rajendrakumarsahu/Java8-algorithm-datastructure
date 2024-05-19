package com.string.example;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterFinder {

	public static void main(String[] args) {
		String text = "Java Guides Net";

		System.out.println("Duplicate characters in the string are:");
		findDuplicates(text);

	}

	public static void findDuplicates(String str) {
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
