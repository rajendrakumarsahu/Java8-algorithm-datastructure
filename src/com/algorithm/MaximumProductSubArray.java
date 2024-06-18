package com.algorithm;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		int arr[] = { 2, 3, -2, -5, 0, 6, -1, 4 };
		int maxProduct = getMaxProduct(arr);
		System.out.println(maxProduct);

	}

	private static int getMaxProduct(int[] arr) {
		int ans = arr[0];
		int leftProduct = 1;
		int rightProduct = 1;
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			leftProduct = leftProduct == 0 ? 1 : leftProduct;
			rightProduct = rightProduct == 0 ? 1 : rightProduct;

			leftProduct *= arr[i];
			rightProduct *= arr[n - 1 - i];
			ans = Math.max(ans, Math.max(leftProduct, rightProduct));

		}

		return ans;
	}

}
