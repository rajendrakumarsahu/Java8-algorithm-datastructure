package com.java8.Concurrency.Executor;

public class ThreadGroupDemo3 {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup g1 = new ThreadGroup("g1");
		ThreadGroup g2 = new ThreadGroup(g1, "g2");

		Runnable r1 = () -> System.out.println("r1-thread");
		Runnable r2 = () -> System.out.println("r2-thread");

		Thread t1 = new Thread(g1, "child-thread-1");
		Thread t2 = new Thread(g1, "child-thread-2");
		t1.start();
		t2.start();
		System.out.println(g1.activeCount());
		System.out.println(g1.activeGroupCount());
		g1.list();

		// Thread.sleep(1000);

		System.out.println(g1.activeCount());
		System.out.println(g1.activeGroupCount());
		g1.list();
	}

}
