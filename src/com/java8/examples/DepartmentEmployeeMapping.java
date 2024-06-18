package com.java8.examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentEmployeeMapping {

	public static void main(String[] args) {
		Department a = new Department("a");
		Department b = new Department("b");
		Department c = new Department("c");

		Employee e1 = new Employee("e1", List.of(a, b));
		Employee e2 = new Employee("e2", List.of(c, b));
		Employee e3 = new Employee("e3", List.of(c, a));
		Employee e4 = new Employee("e4", List.of(a, b, c));

		List<Employee> employees = List.of(e1, e2, e3, e4);
		Map<Department, List<Employee>> result = employees.stream().flatMap(
				employee -> employee.getDepartments().stream().map(department -> new Pair(department, employee)))
				.collect(
						Collectors.groupingBy(pair -> pair.d, Collectors.mapping(pair -> pair.e, Collectors.toList())));
		System.out.println(result);

	}

	static class Department {
		final String name;

		Department(String name) {
			this.name = name;
		}

		public String toString() {
			return name;
		}
	}

	static class Employee {
		final String name;
		final List<Department> departments;

		Employee(String name, List<Department> departments) {
			this.name = name;
			this.departments = departments;
		}

		List<Department> getDepartments() {
			return departments;
		}

		public String toString() {
			return name;
		}
	}

	// this is just a helper class instead of AbstractMap.whatever
	static class Pair {
		final Department d;
		final Employee e;

		Pair(Department d, Employee e) {
			this.d = d;
			this.e = e;
		}
	}

}
