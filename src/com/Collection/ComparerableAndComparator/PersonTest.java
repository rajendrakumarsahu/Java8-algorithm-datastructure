package com.Collection.ComparerableAndComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Ivan", "Vasya", "Petr"));
		persons.add(new Person(2, "Ivan", "Vasya", "Petr"));
		persons.add(new Person(3, "Ivan", "Vasya", "Petr"));
		persons.add(new Person(4, "Ivan", "Gupta", "Ivan"));
		persons.add(new Person(5, "Petr", "Rama", "Igor"));

		Collection<Person> uniquePersons = unique(persons);
		System.out.println(uniquePersons.size());
		assert uniquePersons.size() == 3;

	}

	private static Collection<Person> unique(List<Person> persons) {
		Set<Person> set = new LinkedHashSet<>(persons);
		return set;
	}

}
