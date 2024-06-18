package com.algorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 4, 6, 1, 5, 3, 2 };
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_id = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min_id] > arr[j]) {
					min_id = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_id];
			arr[min_id] = temp;
		}

	}

}
