package com.java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {

	static void changeName(Student s) {
		s.name = "Babu";
	}

	public static void main(String... strings) {

		Student st = new Student("Raju", 4);

		List<Student> l = new ArrayList<>();
		Stream<Student> st1 = l.stream();
		Predicate<? super Student> predicate = (s) -> s.grage > 5;

		st1.filter(predicate);

		st1.forEach(arg0);

	}
}

class Student {
	public String name;
	public int grage;

	public Student(String name, int grage) {
		super();
		this.name = name;
		this.grage = grage;
	}

}