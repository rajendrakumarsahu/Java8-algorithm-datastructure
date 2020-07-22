package com.thread.example;

public class SyncronizedDemo {

	public SyncronizedDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Display d = new Display();
		Display d1 = new Display();
		MyThread t = new MyThread(d, "Rajendra");
		MyThread t1 = new MyThread(d1, "Vimal");
		t.start();
		t1.start();

	}

}
class MyThread extends Thread{
	Display d;
	String name;
	public MyThread(Display d,String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}