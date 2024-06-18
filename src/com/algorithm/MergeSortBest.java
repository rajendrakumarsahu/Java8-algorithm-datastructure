package com.algorithm;

import java.util.Arrays;

public class MergeSortBest {

	public static void main(String[] args) {
		int arr[] = { 4, 6, 1, 5, 3, 2 };
		int numberOfElements = arr.length;
		mergeSort(arr, numberOfElements);
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr, int numberOfElements) {
		if (numberOfElements < 2) {
			return;
		}

		int mid = numberOfElements / 2;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[numberOfElements - mid];

		for (int i = 0; i < mid; i++) {
			leftArr[i] = arr[i];
		}
		for (int i = mid; i < numberOfElements; i++) {
			rightArr[i] = arr[i];
		}
		mergeSort(leftArr, mid);
		mergeSort(rightArr, numberOfElements - mid);

		// Finally merge the partitions
		merge(arr, leftArr, rightArr, mid, numberOfElements - mid);

	}

	private static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
		int i = 0, j = 0, k = 0;

		// Merge arrays based on the smaller values
		while (i < left && j < right) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k++] = leftArr[i++];
			} else {
				arr[k++] = rightArr[j++];
			}
		}

		// Fill out remaining values if any
		while (i < left) {
			arr[k++] = leftArr[i++];
		}
		while (j < right) {
			arr[k++] = rightArr[j++];
		}
	}
}
