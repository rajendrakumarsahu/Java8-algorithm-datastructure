package com.java8.examples;

public class MyDataImpl implements MyData {
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
		//obj.isNull("abc");
		boolean result = MyData.isNull(null);
		System.out.println(result);
	}
}
