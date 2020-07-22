package com.java.algorithm;

public class HashCodeEqualsMethod {

	public static void main(String[] args) {
		Emp e1 = new Emp(1);
		Emp e2 = new Emp(2);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		
	}

}

class Emp {
	int id;

	public Emp(int id) {
		this.id = id;
	}

}