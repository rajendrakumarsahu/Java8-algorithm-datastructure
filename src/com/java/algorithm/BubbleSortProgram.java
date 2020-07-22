package com.java.algorithm;

public class BubbleSortProgram {
	void bubbleSort(int ar[]) {
		int arrayLength = ar.length;
		for (int i = 0; i < arrayLength - 1; i++)
			for (int j = 0; j < arrayLength - i - 1; j++)
				if (ar[j] > ar[j + 1]) {
					int temporaryVariable = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temporaryVariable;
				}
	}

	/* Prints the array */
	void printArray(int ar[]) {
		int arrayLength = ar.length;
		for (int i = 0; i < arrayLength; ++i)
			System.out.print(ar[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		BubbleSortProgram ob = new BubbleSortProgram();
		int ar[] = { 72, 83, 69, 12, 9, 55, 18 };
		ob.bubbleSort(ar);
		System.out.println("Sorted Array is :");
		ob.printArray(ar);
	}

}
