package com.java8.examples;

public class TestLambadaExpression {
	int x = 100;

	public static void main(String[] args) {
		TestLambadaExpression t = new TestLambadaExpression();
		t.m2();
	}

	public void m2() {
		Interf i = () -> {
			int x = 10;
			System.out.println(x);
			System.out.println(this.x);
		};
		i.m1();
	}

}

interface Interf {
	public void m1();
}
