package com.ConcurrentCollection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest implements Runnable {
	static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<String>();

	@Override
	public void run() {
		l.add("D");

	}

	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("c");

		// We create a child thread
		// that is going to modify
		// ArrayList l.
		CopyOnWriteArrayListTest obj = new CopyOnWriteArrayListTest();
		Thread t = new Thread(obj);
		t.start();

		Thread.sleep(1000);

		// Now we iterate through
		// the ArrayList and get
		// exception.
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(l);

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
	}

}
