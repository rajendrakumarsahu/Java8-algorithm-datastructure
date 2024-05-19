package com.algorithm;
import java.util.LinkedList;
import java.util.List;

class A {
	A get() {
		return this;
	}
}

class B extends A {
	B get() {
		return this;
	}

	void message() {
		System.out.println("Hello from B");
	}
}

public class Test {
	public static void main(String[] args) {
		new B().get().message();
		List l = new LinkedList<>();

	}
}