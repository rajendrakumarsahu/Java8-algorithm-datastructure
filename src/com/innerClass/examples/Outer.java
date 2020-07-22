package com.innerClass.examples;

public class Outer {
	int x = 10;
	static int y = 20;

	public class Inner {
		int x =100;
		public void methodOne() {
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(y);

		}
	}

	public void methodTwo() {
		Inner i = new Inner();
		i.methodOne();
	}

	public static void main(String... strings) {
		System.out.println("Main method");
		Outer o = new Outer();
		o.methodTwo();
	}

}
