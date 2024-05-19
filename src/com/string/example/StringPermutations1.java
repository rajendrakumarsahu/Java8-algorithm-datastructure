package com.string.example;

import java.util.HashSet;
import java.util.Set;

public class StringPermutations1 {
	public static void main(String[] args) {
		String str = "abc";
		Set<String> permutations = findPermutations(str);
		System.out.println("All permutations of " + str + " are:");
		for (String perm : permutations) {
			System.out.println(perm);
		}
	}

	public static Set<String> findPermutations(String str) {
		Set<String> result = new HashSet<>();
		if (str == null || str.length() == 0) {
			result.add("");
			return result;
		}

		char firstChar = str.charAt(0);
		String remaining = str.substring(1);
		Set<String> words = findPermutations(remaining);

		for (String word : words) {
			for (int i = 0; i <= word.length(); i++) {
				String prefix = word.substring(0, i);
				String suffix = word.substring(i);
				result.add(prefix + firstChar + suffix);
			}
		}

		return result;
	}
}
