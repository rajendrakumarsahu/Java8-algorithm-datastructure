package com.java8.Optionals;

import java.util.Optional;

public class OtptionalsCreatObj {

	public static void main(String[] args) {
		Optional<Integer> possible = Optional.empty();

		Optional<Integer> possible1 = Optional.of(5);
		possible1.ifPresent(System.out::println);

		Optional<Integer> possible2 = Optional.ofNullable(null);
		// or
		Optional<Integer> possible3 = Optional.ofNullable(5);

	}

}
