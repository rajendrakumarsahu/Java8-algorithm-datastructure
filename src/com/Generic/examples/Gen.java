package com.Generic.examples;

public class Gen<T extends Number> {

	T obj;
	Gen(T obj){
		this.obj = obj;
	}
	public void show() {
		System.out.println("The type of object is::"+obj.getClass().getName());
	}
	public T getObject() {
		return obj;
	}
}
