package com.Collection.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class DemoTreeSet {

	public DemoTreeSet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("Z");
		al.add("P");
		al.add("Y");
		al.add("Y");
		System.out.println(al);
		TreeSet<String> tr = new TreeSet<>(al);
		System.out.println(tr);
		List<Employee> el = new ArrayList<Employee>();
		el.add(new Employee(3, 3000, "Jitendra"));
		el.add(new Employee(1, 1000, "Rajendra"));
		el.add(new Employee(2, 2000, "Vimal"));
		el.add(new Employee(4, 4000, "Hari"));
		el.add(new Employee(5, 5000, "kumar"));
		System.out.println(el);
		Collections.sort(el);
		System.out.println(el);
		TreeSet<Employee> er = new TreeSet<>(el);
		System.out.println(er);
		
		

	}

}
class Employee implements Comparable<Employee> {
	private int id;
	private int sal;
	private String name;
	
	public Employee(int id, int sal, String name) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(this.id >o.id) {
			return 1;
		}else {
		return -1;
		}
	}
	
}
