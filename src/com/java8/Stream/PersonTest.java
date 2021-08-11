package com.java8.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class PersonTest {

	public static void main(String[] args) {
		Person alex = new Person("Alex", 23);
		Person john = new Person("John", 40);
		Person peter = new Person("Peter", 32);
		List<Person> people = Arrays.asList(alex, john, peter);
		Person minByAge = people.stream().max(Comparator.comparing(Person::getAge))
				.orElseThrow(NoSuchElementException::new);

		System.out.println(minByAge);

	}

}
