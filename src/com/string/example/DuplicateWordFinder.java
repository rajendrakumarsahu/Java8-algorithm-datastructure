package com.string.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordFinder {

	public static void main(String[] args) {
		String sentence = "Java is a programming language and Java is also a platform";

		System.out.println("Duplicate words in the string are:");
		findDuplicateWords1(sentence);

	}

	public static void findDuplicateWords(String str) {
		String[] words = str.split(" ");
		Map<String, Integer> wordCountMap = new HashMap<>();

		for (String word : words) {
			String wordLowerCase = word.toLowerCase();
			wordCountMap.put(wordLowerCase, wordCountMap.getOrDefault(wordLowerCase, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
			}
		}
	}

	public static void findDuplicateWords1(String str) {
		String[] words = str.split("\\s+");
		Map<String, Integer> wordCountMap = new HashMap<>();

		for (String word : words) {
			if (wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			} else {
				wordCountMap.put(word, 1);
			}
		}

		Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate word: " + entry.getKey());
			}
		}
	}
}
