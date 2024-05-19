package com.ThreadPool.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		PrintJob[] jobs = { new PrintJob("Rajendra"), new PrintJob("Vimal"), new PrintJob("Pavan"),
				new PrintJob("Sudhansu"), new PrintJob("Mustafa"), };
		for (PrintJob job : jobs) {
			executor.submit(job);
			// executor.execute(job);
		}
		executor.shutdown();
	}

}
