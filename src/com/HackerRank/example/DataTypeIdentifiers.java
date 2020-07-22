package com.HackerRank.example;

import java.util.Scanner;

public class DataTypeIdentifiers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.nextLine();
		Double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		// System.out.println(Pattern.matches("[a-z]+", "dfsdfd"));
		// System.out.println(Pattern.matches("^([+-]?[0-9]\\d*|0)$", "45353"));
		// System.out.println(Pattern.matches("^[\\\\+\\\\-]{0,1}[0-9]+[\\\\.\\\\,][0-9]+$",
		// "4535.3"));

	}

}
