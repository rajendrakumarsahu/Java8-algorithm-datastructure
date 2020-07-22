package com.innerClass.examples;

import com.innerClass.examples.Outer.Inner;

public class Test {

	public static void main(String[] args) {
		
		
		Outer out = new Outer();
		Inner i = out.new Inner();
		i.methodOne();
		

	}

}
