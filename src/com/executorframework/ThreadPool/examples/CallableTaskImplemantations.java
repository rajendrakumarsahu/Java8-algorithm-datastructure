package com.executorframework.ThreadPool.examples;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTaskImplemantations {

	public static void main(String[] args) {
		CallableTask task = new CallableTask("Hell I am callble");

		ExecutorService executorService = Executors.newFixedThreadPool(4);
		Future<String> result = executorService.submit(task);
		try {
			System.out.println(result.get());
		}

		// Catch block to handle the exception
		catch (InterruptedException | ExecutionException e) {

			// Display message only
			System.out.println("Error occurred while executing the submitted task");

			// Print the line number where exception occurred
			e.printStackTrace();
		}

		// Cleaning resource and shutting down JVM by
		// saving JVM state using shutdown() method
		executorService.shutdown();
	}

}
