package com.java8;

import java.util.Arrays;

public class SumIntArray {

	public static void main(String[] args) {
		int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);

	}

}
