package com.HackerRank.example;

public class PairSumDemo {

	public static void main(String[] args) {
		PairSumDemo test = new PairSumDemo();
		int k = 6;
		int arr[] = { 1, 5, 7, -1 };
		int count = test.countPairs(arr, k);
		System.out.println(count);
	}

	private int countPairs(int[] arr, int k) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k) {
					sum++;

				}
			}
		}

		return sum;

	}

}
