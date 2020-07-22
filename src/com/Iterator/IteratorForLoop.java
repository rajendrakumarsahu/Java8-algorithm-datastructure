/**
 * 
 */
package com.Iterator;

/**
 * @author rajendra_kumar_sahu
 *
 */
public class IteratorForLoop {

	/**
	 * @param args
	 */
	public void printAsterickTrinangle(int n) {
		for (int i = 1; i <= n; i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}

			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void printAsterickPyramid(int rows, int k) {
		for (int i = 1; i <= rows; ++i, k = 0) {
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print("  ");
			}

			while (k != 2 * i - 1) {
				System.out.print("* ");
				++k;
			}

			System.out.println();
		}
	}

	public static int solution(int num) {
		int ptr; // Used for bitwise operation.
		for (ptr = 1; ptr > 0; ptr <<= 1) // Find the lowest bit 1
			if ((num & ptr) != 0)
				break;
		int cnt = 0; // Count the (possible) gap
		int ret = 0; // Keep the longest gap.
		for (; ptr > 0; ptr <<= 1) {
			if ((num & ptr) != 0) { // If it's bit 1
				ret = cnt < ret ? ret : cnt; // Get the bigger one between cnt and ret
				cnt = -1; // Exclude this bit
			}
			cnt++; // Increment the count. If this bit is 1, then cnt would become 0 beause we set
					// the cnt as -1 instead of 0.
		}
		return ret;
	}

	public static void main(String[] args) {

		IteratorForLoop obj = new IteratorForLoop();
		// obj.printAsterickTrinangle(30);
		System.out.println(Integer.toBinaryString(1041));
		System.out.println(solution(1041));
	}

}
