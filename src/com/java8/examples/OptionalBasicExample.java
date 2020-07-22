package com.java8.examples;

import java.util.Optional;

public class OptionalBasicExample {

	public OptionalBasicExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 Optional<String> gender = Optional.of("MALE");
		 
	        String answer1 = "Yes";
	        String answer2 = null;

	        System.out.println("Non-Empty Optional:" + gender);
	        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
	        System.out.println("Non-Empty Optional: Gender value : " + gender.orElse("Female"));
	        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
	        System.out.println("Non-Empty Optional: Gender value : " + gender.isPresent());
	        System.out.println("Empty Optional: " + Optional.empty().get());

	        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
	        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
	        
	        // java.lang.NullPointerException
	        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));	

	}

}
