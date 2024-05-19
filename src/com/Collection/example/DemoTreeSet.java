package com.Collection.example;

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

		System.out.println(el);
		Collections.sort(el);
		System.out.println(el);
		TreeSet<Employee> er = new TreeSet<>(el);
		System.out.println(er);

	}

}
