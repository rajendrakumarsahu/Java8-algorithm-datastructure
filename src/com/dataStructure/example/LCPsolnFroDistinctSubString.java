package com.dataStructure.example;

public class LCPsolnFroDistinctSubString {

	public static void printAllCombinations(String soFar, String rest) {
		if (rest.isEmpty()) {
			System.out.println(soFar);
		} else {
			printAllCombinations(soFar + rest.substring(0, 1), rest.substring(1));
			printAllCombinations(soFar, rest.substring(1));
		}
	}

	public static void main(String[] args) {
		printAllCombinations("", "abcd");

	}

}
