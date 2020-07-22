package com.java8.examples;

public interface InterFace2 {
void method2();
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}
}
