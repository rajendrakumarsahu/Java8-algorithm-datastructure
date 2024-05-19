package com.java8.Concurrency.Executor;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class MapForEachTest {

	public static void main(String[] args) {
		ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
		map.put("foo", "bar");
		map.put("han", "solo");
		map.put("r2", "d2");
		map.put("c3", "p0");
		// map.forEach((key, value) -> System.out.printf("%s = %s\n", key, value));

		AtomicInteger atomicInt = new AtomicInteger(0);

		ExecutorService executor = Executors.newFixedThreadPool(2);

		IntStream.range(0, 1000).forEach(i -> {
			Runnable task = () -> atomicInt.updateAndGet(n -> n + 2);
			executor.submit(task);
		});

		// stop(executor);

		System.out.println(atomicInt.get()); // => 2000

	}

}
