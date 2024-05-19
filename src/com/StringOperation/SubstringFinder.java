package com.StringOperation;

public class SubstringFinder {
	public static void main(String[] args) {
		String str = "Hello, world!";
		String substring = "world";

		int index = findSubstring(str, substring);

		if (index != -1) {
			System.out.println("Substring found at index: " + index);
		} else {
			System.out.println("Substring not found.");
		}
	}

	public static int findSubstring1(String str, String substring) {
		int strLength = str.length();
		int subLength = substring.length();

		for (int i = 0; i <= strLength - subLength; i++) {
			int j;
			for (j = 0; j < subLength; j++) {
				if (str.charAt(i + j) != substring.charAt(j)) {
					break;
				}
			}
			if (j == subLength) {
				return i; // Substring found starting at index i
			}
		}

		return -1; // Substring not found
	}

	public static int findSubstring(String str, String substring) {
		return str.indexOf(substring);
	}
}
