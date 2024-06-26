package com.java8.Concurrency.Executor;

import java.util.concurrent.TimeUnit;

public class RunnableTask1 {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			try {
				String name = Thread.currentThread().getName();
				System.out.println("Foo " + name);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Bar " + name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();

	}

}
