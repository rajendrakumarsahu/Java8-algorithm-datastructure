package com.algorithm;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinSumAndMaxSum {
	public static void miniMaxSum(List<Integer> arr) {
		long min_value = 0;
		long max_value = 0;
		int n = arr.size();
		Collections.sort(arr);
		for (int i = 0, j = n - 1; i < n - 1; i++, j--) {
			min_value += arr.get(i);
			max_value += arr.get(j);
		}
		System.out.println(min_value + " " + max_value);
	}

	public static void main(String[] args) throws IOException {
		List<Integer> arr = Arrays.asList(1, 3, 5, 7, 9);
		miniMaxSum(arr);
	}
}
