package com.java8.examples;

public class DoubleColonOperatorMethodReferance {

	public DoubleColonOperatorMethodReferance() {
		// TODO Auto-generated constructor stub
	}
	public  static void m1() {
		for(int i=0;i<10;i++)
			System.out.println("M1 method calling");
	}

	public   void m2() {
		for(int i=0;i<10;i++)
			System.out.println("M2 method calling");
	}
	public static void main(String[] args) {
		DoubleColonOperatorMethodReferance obj = new DoubleColonOperatorMethodReferance();
		Runnable r = obj:: m2;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
		

	}

}
