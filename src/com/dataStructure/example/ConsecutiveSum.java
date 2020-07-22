package com.dataStructure.example;

public class ConsecutiveSum {

	public static void main(String[] args) {
		int N = 15;
		System.out.println(func(N));
		N = 10;
		System.out.println(func(N));

	}

	static int consecutive(int N) {
		int count = 0;
		for (int L = 1; L * (L + 1) < 2 * N; L++) {
			float a = (float) ((1.0 * N - (L * (L + 1)) / 2) / (L + 1));
			if (a - (int) a == 0.0)
				count++;
		}
		return count;
	}

	public static int func(long num) {
		int count = 0;
		long temp, i, j;
		long limit = (num / 2);
		for (i = 1; i <= limit; i++) {
			temp = num;
			j = i;
			while (j < temp) {
				temp = temp - j;
				j++;
			}
			if (j == temp) {
				count++;
			}
		}
		return count;
	}

}
