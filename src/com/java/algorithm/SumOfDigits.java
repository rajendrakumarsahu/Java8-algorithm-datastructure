package com.java.algorithm;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		long n, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		n = sc.nextLong();
		for (sum = 0; n != 0; n /= 10) {
			sum += n % 10;
		}
		System.out.println("Sum of digits " + sum);

	}

}
