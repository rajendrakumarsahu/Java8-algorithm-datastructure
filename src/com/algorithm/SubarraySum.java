package com.algorithm;
import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
	public static int[] findSubarrayWithGivenSum(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		int currSum = 0;
		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];
			if (currSum == sum) {
				return new int[] { 0, i };
			}
			if (map.containsKey(currSum - sum)) {
				return new int[] { map.get(currSum - sum) + 1, i };
			}
			map.put(currSum, i);
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] arr = { 15, 2, 4, 8, 5, 10, 23 };
		int targetSum = 35;

		int[] subarray = findSubarrayWithGivenSum(arr, targetSum);

		if (subarray.length == 0) {
			System.out.println("No subarray with sum " + targetSum + " found.");
		} else {
			System.out.println("Sum found between indexes " + subarray[0] + " and " + subarray[1]);
		}
	}
}
