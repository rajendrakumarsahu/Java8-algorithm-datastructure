package com.algorithm;

public class LargestRectangleInBinaryMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 } };

		int maxArea = maximalRectangle(matrix);
		System.out.println("Largest rectangle area containing only 1's: " + maxArea);
	}

	public static int maximalRectangle(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return 0;
		}

		int rows = matrix.length;
		int cols = matrix[0].length;

		int[] heights = new int[cols];
		int maxArea = 0;

		for (int row = 0; row < rows; row++) {
			// Update heights array based on the current row
			for (int col = 0; col < cols; col++) {
				if (matrix[row][col] == 0) {
					heights[col] = 0;
				} else {
					heights[col]++;
				}
			}

			// Calculate the largest rectangle area using the heights array
			maxArea = Math.max(maxArea, largestRectangleArea(heights));
		}

		return maxArea;
	}

	public static int largestRectangleArea(int[] heights) {
		if (heights == null || heights.length == 0) {
			return 0;
		}

		int maxArea = 0;
		int n = heights.length;
		int[] stack = new int[n + 1]; // Use stack to keep track of indices

		for (int i = 0; i <= n; i++) {
			int height = (i == n) ? 0 : heights[i]; // Last element is height 0 for calculation

			while (maxArea > 0 && height < heights[stack[maxArea - 1]]) {
				int h = heights[stack[--maxArea]];
				int w = (maxArea == 0) ? i : i - stack[maxArea - 1] - 1;
				maxArea = Math.max(maxArea, h * w);
			}

			stack[maxArea++] = i;
		}

		return maxArea;
	}
}
