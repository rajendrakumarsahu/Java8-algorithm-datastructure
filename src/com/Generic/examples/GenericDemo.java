package com.Generic.examples;

import java.util.ArrayList;

public class GenericDemo {

	public GenericDemo() {
		// TODO Auto-generated constructor stub
	}

	public void m1(ArrayList<? extends Number> al) {
		
		
	}
	
	public static void main(String[] args) {
		Gen<Integer> g1 = new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getObject());
		

	}

}
