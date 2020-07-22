package com.java8.examples;

import java.util.Arrays;
import java.util.List;

public class OptionalExample {

	public OptionalExample() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String...strings) {
//		List<String> listOfStrings = Arrays.asList("Mark", "Howard", "Anthony D'Cornian");
//		Optional<String> largeString 
//		  = listOfStrings.stream().filter(str -> str.length() > 10).findAny();
//		largeString.ifPresent(System.out::println);
//
//		Optional<String> veryLargeString 
//		  = listOfStrings.stream().filter(str -> str.length() > 20).findAny();
//		veryLargeString.ifPresent(System.out::println);
		
		List<Integer> list = Arrays.asList(10,6,12,4,40);
		System.out.println(OptionalExample.sumStream(list));
		
	}
	
	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}

}
