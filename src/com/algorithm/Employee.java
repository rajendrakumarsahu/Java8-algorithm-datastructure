package com.algorithm;
public class Employee implements Comparable<Employee> {

	int id;
	String name;
	String desination;

	public Employee(int id, String name, String desination) {
		super();
		this.id = id;
		this.name = name;
		this.desination = desination;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesination() {
		return desination;
	}

	public void setDesination(String desination) {
		this.desination = desination;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desination=" + desination + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
