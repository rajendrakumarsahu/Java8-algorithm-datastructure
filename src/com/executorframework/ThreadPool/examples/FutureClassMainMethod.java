package com.executorframework.ThreadPool.examples;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureClassMainMethod {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		Future<Integer> future = new SquareCalculator().calculate(10);

		while (!future.isDone()) {
			System.out.println("Calculating...");
			Thread.sleep(300);
		}
		Integer result1 = future.get(500, TimeUnit.MILLISECONDS);

		// Integer result = future.get();

		System.out.println(result1);

	}

}
