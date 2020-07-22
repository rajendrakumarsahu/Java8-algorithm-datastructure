package com.logical.examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution1 {

	// Complete the solve function below.
	static int[] solve(int[] a, int[] b) {
		int[] temp = new int[2];
		int a1 = 0;
		int b1 = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > b[i]) {
				a1 = a1 + 1;
			} else if (a[i] < b[i]) {
				b1 = b1 + 1;
			}
		}
		temp[0] = a1;
		temp[1] = b1;
		return temp;

	}

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] a) {

		int acorn = 0;
		int bcorn = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i] == a[j])
					acorn = acorn + a[i][j];

			}

		}
		for (int i = a.length; i < a.length; i--) {
			for (int j = a.length-a[i].length; j < a[i].length; j++) {
				bcorn = bcorn + a[i][j];
				break;
			}
		}
		return acorn + bcorn;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int[] a = new int[3];
		a[0] = 3;
		a[1] = 5;
		a[2] = 8;
		// String[] aItems = scanner.nextLine().split(" ");
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//
		// for (int i = 0; i < 3; i++) {
		// int aItem = Integer.parseInt(aItems[i]);
		// a[i] = aItem;
		// }
		//
		int[] b = new int[3];
		b[0] = 5;
		b[1] = 5;
		b[2] = 9;
		//
		// String[] bItems = scanner.nextLine().split(" ");
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//
		// for (int i = 0; i < 3; i++) {
		// int bItem = Integer.parseInt(bItems[i]);
		// b[i] = bItem;
		// }

		int[] result = solve(a, b);
		for (int i : result) {
			System.out.println(i);
		}

		// for (int i = 0; i < result.length; i++) {
		// bufferedWriter.write(String.valueOf(result[i]));
		//
		// if (i != result.length - 1) {
		// bufferedWriter.write(" ");
		// }
		// }
		//
		// bufferedWriter.newLine();
		//
		// bufferedWriter.close();

		scanner.close();
	}
}
