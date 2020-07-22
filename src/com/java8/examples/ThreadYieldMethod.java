package com.java8.examples;

public class ThreadYieldMethod {

	public ThreadYieldMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(() -> {
			for(int i=0;i<10;i++) {
			System.out.println("Sita Thread");
			
			}
			
		}
		);
		t.start();
		t.interrupt();
		for(int i=0;i<10;i++)
			System.out.println("Ram Thread");

	}

}
