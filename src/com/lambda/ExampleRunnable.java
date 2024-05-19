package com.lambda;

public class ExampleRunnable {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous run method");

			}
		};
		Thread th = new Thread(runnable);
		th.start();

		Runnable rn = () -> System.out.print("Runnable with lambda");
		Thread th1 = new Thread(rn);
		th1.start();

	}

}
