package com.thread.example;

public class Display {

	public Display() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void wish(String name) {
		for(int i=0;i<5;i++) {
		System.out.println("Good Morning");
		try {
			Thread.sleep(200);
		}catch (Exception e) {
			
		}
		System.out.println(name);
		}
	}

}
