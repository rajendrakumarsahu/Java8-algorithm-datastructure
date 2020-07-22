package com.innerClass.examples;

public class MyThread {

	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String...strings) {
		Thread t = new Thread() {
			public void run(){
				for(int i=0;i<=10;i++)
				System.out.println("child Thread");
			}
		};
		//t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("Main Thread");
		
	}

}
