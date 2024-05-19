package com.algorithm;

public class QuickSortDSA {

	public static void main(String[] args) {
		int arr[] = { 12, 2, 45, 88, 66, 22, 33, 77, 99, 11, 1, 5, 5 };
		quickSort(arr, 0, arr.length - 1);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	private static void swap(int[] arr, int firstIndex, int secondIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}

}
