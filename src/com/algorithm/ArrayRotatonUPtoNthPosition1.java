package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayRotatonUPtoNthPosition1 {
	public static void main(String[] args) {
		// Initialize the array
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		// Number of elements to rotate to the right
		int k = 4;

		// Call the rotateArray function to rotate the array
		rotateArray(arr, k);

		// Print the rotated array
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
	}

	// Function to rotate an array by k elements to the
	// right
	public static void rotateArray(ArrayList<Integer> arr, int k) {
		// Find the size of the array
		int n = arr.size();

		// Mod k with the size of the array
		// To handle the case where k is greater than the
		// size of the array
		k %= n;

		List<Integer> fistArray = arr.subList(0, k);
		List<Integer> secondArray = arr.subList(k, n);

		// Reverse the entire array
		// Collections.reverse(fistArray);
		Collections.reverse(secondArray);
		Collections.reverse(secondArray);

		List<Integer> list = new ArrayList<>(secondArray);
		list.addAll(fistArray);
		list.forEach(System.out::println);

	}
}
