package com.techolution.puzzle;

public class FindTheWinner {

	static String winner(int[] andrea, int[] maria, String s) {
		EvenInter even = num -> (num % 2 == 0);
		int limit = maria.length;
		int pAnd = 0;
		int pMr = 0;
		if (andrea.length < maria.length) {
			limit = andrea.length;
		}
		if (s.equalsIgnoreCase("Even")) {
			for (int i = 0; i < limit; i++) {
				if (even.test(i)) {
					pAnd += (andrea[i] - maria[i]);
					pMr += (maria[i] - andrea[i]);
				}
			}

		} else {
			for (int i = 0; i < limit; i++) {
				if (!even.test(i)) {
					pAnd += (andrea[i] - maria[i]);
					pMr += (maria[i] - andrea[i]);
				}
			}
		}

		if (pAnd > pMr) {
			return "Andrea";
		} else {
			return "Maria";
		}

	}

	public static void main(String[] args) {
		int andrea[] = { 1, 2, 3 };
		int maria[] = { 2, 1, 3 };
		String s = "Odd";
		System.out.println(winner(andrea, maria, s));

	}

}

@FunctionalInterface
interface EvenInter {
	public abstract boolean test(int a);
}