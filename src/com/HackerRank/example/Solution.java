package com.HackerRank.example;

import java.util.function.Function;

public class Solution {

	public static void main(String[] args) {
		Function<Integer, String> fn = s -> {
			if (s % 2 == 0) {

				if (s >= 6 && s <= 20) {
					return "Weird";
				} else {
					return "Not Weird";
				}
			} else {

				return "Weird";
			}
		};

		System.out.println(fn.apply(3));
		System.out.println(fn.apply(18));
		System.out.println(fn.apply(24));
		System.out.println(fn.apply(4));
		System.out.println(fn.apply(20));

	}

}
