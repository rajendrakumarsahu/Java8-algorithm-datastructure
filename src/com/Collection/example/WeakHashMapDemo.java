package com.collection.example;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public WeakHashMapDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		Map m = new WeakHashMap();
		Temp t = new Temp();
		//m.put("a", t);
		m.put(t,"Ashok");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(m);

	}

}
class Temp{
	@Override
	public String toString() {
		return "temp";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called:::");
	}
}