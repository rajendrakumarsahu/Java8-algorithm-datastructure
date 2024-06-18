package com.algorithm;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int inputArmstrongNumber = 1634; // Input number to check armstrong
		if (isArmstrong(inputArmstrongNumber))
			System.out.println(inputArmstrongNumber + " is an Armstrong Number");
		else
			System.out.println(inputArmstrongNumber + " is not an Armstrong Number");

	}

	static boolean isArmstrong(int x) {
		// Calling order function
		int n = order(x);
		int temp = x, sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = (int) (sum + Math.pow(r, n));
			temp = temp / 10;
		}

		// If satisfies Armstrong condition
		return (sum == x);
	}

	static int order(int x) {
		int n = 0;
		while (x != 0) {
			n++;
			x = x / 10;
		}
		return n;
	}

	private static boolean isArmstrongNumberByJava8(int n) {
		int len = String.valueOf(n).length();
		int sum = String.valueOf(n).chars().map(ch -> Character.digit(ch, 10)).map(digit -> (int) Math.pow(digit, len))
				.sum();
		return sum == n;
	}
}
