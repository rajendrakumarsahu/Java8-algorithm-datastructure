package com.string.example;

public class PalindromeChecker {
	public static boolean isPalindrome(String str) {
		// Step 1: Normalize the string
		String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int left = 0;
		int right = cleaned.length() - 1;

		// Step 2: Two Pointers Approach
		while (left < right) {
			if (cleaned.charAt(left) != cleaned.charAt(right)) {
				return false; // It's not a palindrome if there's a mismatch
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		String testString = "madam";
		boolean result = isPalindrome(testString);
		System.out.println("Is the string \"" + testString + "\" a palindrome? " + result);
	}
}
