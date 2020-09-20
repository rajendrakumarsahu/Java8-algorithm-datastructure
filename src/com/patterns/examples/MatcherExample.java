package com.patterns.examples;

public class MatcherExample {
	public static void main(String[] args) {

		String str = "I am  a   " + "\n  Man    of  Peac|e" + "\t" + "   .";

		str = str.replaceAll("[<|>|;\\s|\\t|\\r\\n]+", "").trim();
		System.out.println(str);
	}
}
