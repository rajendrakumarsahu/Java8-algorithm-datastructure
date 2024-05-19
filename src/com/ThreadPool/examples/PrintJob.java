package com.ThreadPool.examples;

public class PrintJob implements Runnable {
	String name;

	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + "::::::::::" + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(name + "::Job Completed::::" +
		// Thread.currentThread().getName());

	}

}
