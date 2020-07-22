package com.HackerRank.example;

import java.util.Scanner;

public class MathCalculatatons {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int result = 0;
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			for (int j = 0; j < n; j++) {
				if (j == 0) {
					result = result + (a + (int) Math.pow(2, j) * b);
				} else {
					result = result + ((int) Math.pow(2, j) * b);
				}
				System.out.print(result + " ");
			}
			System.out.println();
		}

	}

}
