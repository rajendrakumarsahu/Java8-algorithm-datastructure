package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemoryTest {
	static List<String> list = new ArrayList<String>();

	public static void main(String[] args) {

		Integer[] array = new Integer[10000 * 10000];
		for (int i = 0; i < array.length; i++) {
			System.out.println("****");
			array[i] = i;
		}
		System.out.println(Arrays.asList(array));
	}

}
