package com.java8.examples;
public class MyClass implements InterFace1, InterFace2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub

	}

	public void log1(String str) {
		System.out.println("MyClass logging::" + str);
		// InterFace1.log("abc");
	}

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		InterFace2.super.log(str);
	}

	public static void main(String... strings) {
		MyClass myClass = new MyClass();
		myClass.log("Rajendra");
		
		
		Parent2 parent2 = new Parent2();
		parent2.m1();
	}

}
