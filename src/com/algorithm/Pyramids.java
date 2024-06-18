package com.algorithm;

public class Pyramids {

	public static void main(String[] args) {

		String st = """
				1
				2 3
				4 5 6 """;
		// System.out.println(st);
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int j = 0;
		// printPyramid(12);
		pattern(5, 1);
	}

	private static void printPyramidRecursive(int n) {
		if (n == 0) {
			return;
		}
		printPyramidRecursive(n - 1);
		System.out.print(n);
		System.out.println();
	}

	static void printRow(int num, int p) {
		// base case
		if (num == 0)
			return;
		System.out.print(p);

		// recursively calling printRow()
		printRow(num - 1, p++);
	}

	// function to print the pattern
	static void pattern(int n, int i) {
		// base case
		if (n == 0)
			return;
		printRow(n, i);
		System.out.println();

		// recursively calling pattern()
		pattern(n - 1, i + 1);
	}

	private static void printPyramid(int n) {
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
