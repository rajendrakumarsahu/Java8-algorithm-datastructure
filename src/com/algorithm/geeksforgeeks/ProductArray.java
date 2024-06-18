package com.algorithm.geeksforgeeks;

import java.util.Arrays;

public class ProductArray {

	public static void main(String[] args) {
		ProductArray pa = new ProductArray();
		int arr[] = { 2, 3, 4, 5, 6 };
		int n = arr.length;
		System.out.println("The product array is : ");
		pa.productArray(arr, n);

	}

	private void productArray(int[] arr, int n) {
		// Base case
		if (n == 1) {
			System.out.print(0);
			return;
		}

		// Initialize memory to all arrays
		int left[] = new int[n];
		int right[] = new int[n];
		int prod[] = new int[n];

		int i, j;

		/* Left most element of left array is always 1 */
		left[0] = 1;

		/* Right most element of right array is always 1 */
		right[n - 1] = 1;
		/* { 10, 3, 5, 6, 2 } Construct the left array */
		for (i = 1; i < n; i++) {
			left[i] = arr[i - 1] * left[i - 1];
			System.out.println(Arrays.toString(left));
		}

		/* Construct the right array */
		for (j = n - 2; j >= 0; j--) {

			right[j] = arr[j + 1] * right[j + 1];
			System.out.println(Arrays.toString(right));
		}

	}

}
