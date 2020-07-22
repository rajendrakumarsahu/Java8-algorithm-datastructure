package com.HackerRank.example;

public class GetDataTypes {

	public GetDataTypes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// byte > short > int > long
		System.out.println("Byte Range " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println("Short Range " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		System.out.println("int Range " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("Long Range " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
		long l = 32767;
		if (l >= Byte.MIN_VALUE && l <= Byte.MAX_VALUE) {
			System.out.println("* byte");
		}
		if (l >= Short.MIN_VALUE && l <= Short.MAX_VALUE) {
			System.out.println("* short");
		}
		if (l >= Integer.MIN_VALUE && l <= Integer.MAX_VALUE) {
			System.out.println("* int");
		}
		if (l >= Long.MIN_VALUE && l <= Long.MAX_VALUE) {
			System.out.println("* long");
		}

	}

}
