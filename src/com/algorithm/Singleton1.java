package com.algorithm;

class Singleton1 {
	private static Singleton1 instance;

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}

		return instance;

	}

	public static void main(String[] args) {
		Singleton1 st = new Singleton1();
		Singleton1 st1 = new Singleton1();
		System.out.println(st.getInstance().hashCode());
		System.out.println(st1.getInstance().hashCode());
	}

}