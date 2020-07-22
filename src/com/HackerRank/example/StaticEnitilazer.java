package com.HackerRank.example;

public class StaticEnitilazer {
	private static int B;
	private static int H;
	private static boolean flag;
	static {

		try {
			if (B >= 0 && H >= 0) {
				flag = true;
			} else {
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}

	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}

}
