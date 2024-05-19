package com.java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {

	static void changeName(Student s) {
		s.name = "Babu";
	}

	public static void main(String... strings) {

		List<Student> l = new ArrayList<>();
		Student st = new Student("Raju", 4);
		l.add(st);
		Student st2 = new Student("Sradha", 25);
		l.add(st2);

		Predicate<? super Student> predicate = (s) -> s.age > 5;
		Stream<Student> st1 = l.stream().filter(predicate);

		// st1.filter(predicate);

		Consumer<Student> printStudent = element -> {
			System.out.println("Name::" + element.name);
			System.out.println("Age::" + element.age);
		};

		st1.forEach(printStudent);

	}
}

class Student {
	public String name;
	public int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}