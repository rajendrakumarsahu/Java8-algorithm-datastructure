package com.exceptions.examples;

public class OOM {

	public OOM() {
		// TODO Auto-generated constructor stub
	}

	static final int SIZE = 2 * 1024 * 1024;

	public static void main(String[] a) {
		int[] i = new int[SIZE];
		int[] i1 = new int[SIZE];
		int[] i2 = new int[SIZE];
		int[] i3 = new int[SIZE];
		int[] i4 = new int[SIZE];
	}

}
