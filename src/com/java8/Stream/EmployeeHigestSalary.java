package com.java8.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeHigestSalary {

	public static void main(String[] args) {
		List<Employee1> empList = new ArrayList<>();
		empList.add(new Employee1(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee1(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee1(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee1(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

		empList.add(new Employee1(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee1(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee1(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee1(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee1(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

		// List<Employee1> emplist1 =
		// empList.stream().collect(Collectors.groupingBy(Employee1::getDeptName,Collectors.counting()))

		// Group the Employees by city.
		Map<String, List<Employee1>> empByCity;
		empByCity = empList.stream().collect(Collectors.groupingBy(Employee1::getCity));
		System.out.println("Employees grouped by city :: \n" + empByCity);

		// Group the Employees by age.

		Map<Integer, List<Employee1>> empByAge = empList.stream().collect(Collectors.groupingBy(Employee1::getAge));
		System.out.println("Employees grouped by age :: \n" + empByAge);

		// Find the count of male and female employees present in the organization.
		Map<String, Long> noOfMaleAndFemaleEmployees = empList.stream()
				.collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
		System.out.println(
				"Count of male and female employees present in the organization:: \n" + noOfMaleAndFemaleEmployees);

		// Print the names of all departments in the organization.

		System.out.println("Names of all departments in the organization ");
		empList.stream().map(Employee1::getDeptName).distinct().forEach(System.out::println);

		System.out.println("Employee details whose age is greater than 28");
		empList.stream().filter(e -> e.getAge() > 28).collect(Collectors.toList()).forEach(System.out::println);

		OptionalInt max = empList.stream().mapToInt(Employee1::getAge).max();
		if (max.isPresent())
			System.out.println("Maximum age of Employee: " + max.getAsInt());

		// Print Average age of Male and Female Employees.

		Map<String, Double> avgAge = empList.stream()
				.collect(Collectors.groupingBy(Employee1::getGender, Collectors.averagingInt(Employee1::getAge)));
		System.out.println("Average age of Male and Female Employees:: " + avgAge);

		// Print the number of employees in each department.

		Map<String, Long> countByDept = empList.stream()
				.collect(Collectors.groupingBy(Employee1::getDeptName, Collectors.counting()));
		System.out.println("No of employees in each department");
		for (Map.Entry<String, Long> entry : countByDept.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Department wise higest salary
		Comparator<Employee1> bySalary = Comparator.comparing(Employee1::getSalary);

		Map<String, Optional<Employee1>> collect = empList.stream().collect(
				Collectors.groupingBy(Employee1::getDeptName, Collectors.reducing(BinaryOperator.maxBy(bySalary))));
		collect.entrySet().stream().forEach(System.out::println);
		// approch 2
		Map<String, Optional<Employee1>> map = empList.stream().collect(Collectors.groupingBy(Employee1::getDeptName,
				Collectors.maxBy(Comparator.comparing(Employee1::getSalary))));

		Map<String, Employee1> stringEmployeeMap = empList.stream()
				.collect(Collectors.groupingBy(Employee1::getDeptName, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary)), Optional::get)));

	}

}
