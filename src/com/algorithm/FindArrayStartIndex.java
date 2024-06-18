package com.algorithm;

import java.util.Arrays;

public class FindArrayStartIndex {

	public static void main(String[] args) {

		int[] arr1 = { 12, 11, 111, 22, 1222, 565, 0112 };

		Arrays.stream(arr1).filter(p -> String.valueOf(p).startsWith("1")).forEach(System.out::println);

	}

}
