package com.java8.newFeatures;

public class LambadaExpression {
	int x = 777;
	public void m2() {
		Interf i = ()->{
			int x = 888;
			System.out.println(x);
			System.out.println(this.x);
		};
		i.m1();
	}
	public static void main(String[] args) {
		LambadaExpression t = new LambadaExpression();
		t.m2(); 
	}

}
interface Interf {
 public void m1();
 } 