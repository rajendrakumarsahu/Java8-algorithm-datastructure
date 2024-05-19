package com.java8.Concurrency.Executor;

public class ThreadGroupsTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		ThreadGroup g1 = new ThreadGroup("g1");
//		g1.setMaxPriority(Thread.NORM_PRIORITY);
//		System.out.println(g1.getName());
		System.out.println(g1.getMaxPriority());
//		System.out.println(g1.getParent().getName());

		Runnable r1 = () -> System.out.println("r1-thread");
		Runnable r2 = () -> System.out.println("r2-thread");

		Thread t1 = new Thread(g1, r1);
		Thread t2 = new Thread(g1, r2);

		g1.setMaxPriority(Thread.NORM_PRIORITY);

		System.out.println(g1.getMaxPriority());

		t1.start();
		t2.start();

	}

}
