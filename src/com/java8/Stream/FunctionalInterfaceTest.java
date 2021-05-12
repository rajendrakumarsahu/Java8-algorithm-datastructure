package com.java8.Stream;

public class FunctionalInterfaceTest {
	public static void main(String args[]) {
		// create anonymous inner class object
		new Thread(() -> {
			System.out.println("New thread created");
		}).start();
	}
}
