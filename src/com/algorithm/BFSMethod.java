package com.algorithm;

public class BFSMethod {

	public static void main(String[] args) {

//		Given a list of stock prices for a company, find the maximum amount of money you can make
//		with one trade. A trade is a buy and sell.
//		 
//		For example:
//		[9,3,2, 1 ,5,7,2, 8 ,3,4] -> Max diff is 7, from 1 and 8.
//		Notice that the difference between 9 and 1 is higher, but it doesn't count because 1 comes after 9.
		int arr[] = { 9, 3, 2, 1, 5, 7, 2, 8, 3, 4 };
		int maxProfit = getMaxProfit(arr, 1, 9);

	}

	private static int getMaxProfit(int[] arr, int start, int end) {
		int maxProfit = 0;

		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j <= arr.length; j++) {
				int temp;
				temp = arr[j] - arr[i];
				if (maxProfit < temp) {
					maxProfit = temp;

				}
			}
		}

		return 0;
	}

}
