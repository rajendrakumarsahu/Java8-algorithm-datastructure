package com.designpattern.examples;

public class SingleToneClass {
	private static SingleToneClass singleToneClass;

	private SingleToneClass() {
		System.out.println("Singleton is Instantiated.");
	}

	public static SingleToneClass getInstance() {
		if (singleToneClass == null) {
			System.out.println("1st gate");
			synchronized (SingleToneClass.class) {
				System.out.println("2nd gate");
				if (singleToneClass == null) {
					System.out.println("3rd gate");
					singleToneClass = new SingleToneClass();
				}
			}
		}
		System.out.println("normal");
		return singleToneClass;
	}

	public static void doSomething() {
		System.out.println("Somethong is Done.");
	}
}
