package com.algorithm;

public class CountSort1 {

	public static void main(String[] args) {
		int[] inputArray = { 4, 3, 12, 2, 5, 5, 3, 9 };
		countSort(inputArray);

		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}

	}

	private static void countSort(int[] inputArray) {

		int max = 0;
		int min = 0;

		for (int i = 0; i < inputArray.length; i++) {
			max = Math.max(max, inputArray[i]);
		}
		for (int i = 0; i < inputArray.length; i++) {
			min = Math.min(min, inputArray[i]);
		}
		int[] countArr = new int[(max - min) + 1];

		for (int i = 0; i < inputArray.length; i++) {
			countArr[inputArray[i] - min]++;
			// System.out.println(Arrays.toString(countArr));
		}
		// System.out.println("***********************************");
		// [1, 0, 2, 1, 2, 0, 0, 0, 1, 0, 0, 1] [0, 0, 1, 2, 1, 2, 0, 0, 0, 1, 0, 0, 1]
		int j = 0;
		for (int i = min; i <= max; i++) {
			while (countArr[i - min] > 0) {
				inputArray[j++] = i;
				countArr[i - min]--;
				// System.out.println(Arrays.toString(inputArray));
			}
		}

	}

}
