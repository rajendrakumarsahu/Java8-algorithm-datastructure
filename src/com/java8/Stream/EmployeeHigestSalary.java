package com.java8.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeHigestSalary {

	public static void main(String[] args) {
		List<Employee1> empList = new ArrayList<>();
		empList.add(new Employee1(1, "abc", 28, 10000, "F", "HR", "Blore", 2020));
		empList.add(new Employee1(2, "xyz", 29, 12000, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee1(3, "efg", 30, 13000, "M", "HR", "Chennai", 2014));
		empList.add(new Employee1(4, "def", 32, 14000, "F", "HR", "Chennai", 2013));

		empList.add(new Employee1(5, "ijk", 22, 15000, "F", "IT", "Noida", 2013));
		empList.add(new Employee1(6, "mno", 27, 16000, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee1(7, "uvw", 26, 17000, "F", "IT", "Pune", 2016));
		empList.add(new Employee1(8, "pqr", 23, 18000, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee1(9, "stv", 25, 20000, "M", "IT", "Blore", 2010));

		// Department wise higest salary
		// approch 1
		displayDepartmentWiseMaxSalary(empList);

		// approch 2
//		Map<String, Optional<Employee1>> map = empList.stream().collect(Collectors.groupingBy(Employee1::getDeptName,
//				Collectors.maxBy(Comparator.comparing(Employee1::getSalary))));
//
//		Map<String, Employee1> stringEmployeeMap = empList.stream()
//				.collect(Collectors.groupingBy(Employee1::getDeptName, Collectors.collectingAndThen(
//						Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary)), Optional::get)));
//
//		Map<String, List<Employee1>> deptEmployees = empList.stream()
//				.collect(Collectors.groupingBy(Employee1::getDeptName));
//
//		Map<String, Double> thirdHighestSalary = new HashMap<>();
//		deptEmployees.forEach((dept, empL) -> {
//			List<Double> sortedSalairs = empL.stream().map(Employee1::getSalary).sorted(Comparator.reverseOrder())
//					.collect(Collectors.toList());
//
//			if (sortedSalaris.size() >= 3) {
//				double thirdHighestSaalry = sortedSalaries.get(2);
//				thirdHighestSalary.put(dept, thirdHighestSalary);
//			}
//		});

	}

	private static void displayDepartmentWiseMaxSalary(List<Employee1> empList) {
		// Map<String,Employee1> secondHighestSal =
		// empList.stream().collect(Collectors.groupingBy(Employee1::getDeptName,Collectors.collectingAndThen(null,
		// null)))
		Map<String, Employee1> highSalByDepart = empList.stream().collect(Collectors
				.groupingBy(Employee1::getDEpartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
	}

}
