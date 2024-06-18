package com.algorithm;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 12, 45, 88, 2, 3, 4, 5, 6 };
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	private static void sort(int[] arr) {

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

	}

}
