package com.algorithm;

public class GamblingProblems {

	public int solution(int N, int K) {
		int result = 1;
		while (N > 3 && K > 0) {
			if (N % 2 == 1) {
				N -= 1;
			} else {
				N /= 2;
				K -= 1;
			}
			result += 1;
		}
		return result + N - 1;

	}

	public int solution1(int N, int K) {
		if (K < 1 || N < 4)
			return N - 1;

		return 1 + (N % 2 == 0 ? solution(N - 1, K) : solution(N / 2, K - 1));
	}

	public int solution2(int N, int K) {
		int R = 0;
		while (N >= 1 && K > 0) {
			if (N % 2 == 0) {
				N = N - 1;
			} else {
				N = N / 2;
				K = K - 1;
			}
			R += 1;
		}
		return R + N - 1;
	}

	public int solution3(int N, int K) {
		int R = 0;
		for (; N >= 1 && K > 0; R++) {
			if (N % 2 == 0) {// when N is even
				N -= 1;
			} else {// when N is odd
				N /= 2;
				K -= 1;
			}
		}
		return R + N - 1;
	}

	public int revSolution(int N, int R) {
		int K = 0;
		if (K > 0) {
			for (int r = 0; r <= R; r++) {
				if (r % 2 == 0) {// when win in even
					N += 1;
				} else {// when N is odd
					N *= 2;
					K += 1;
				}
			}
		}
		return N - (R + 1);

	}

	public int Solution4(int N, int K) {
		int R = 0;
		while (N != 0) {
			if (K > 0 && N % 2 == 0) {
				N = N / 2;
				K = K - 1;
			} else {
				N = N - 1;

			}
			R = R + 1;
		}

		return K;

	}

	public static void main(String[] args) {
		GamblingProblems test = new GamblingProblems();
		System.out.println(test.solution2(8, 0));
		System.out.println(test.solution2(18, 2));
		System.out.println(test.solution2(10, 10));

//		System.out.println(test.revSolution(8,7));
//		System.out.println(test.revSolution(18,2));
//		System.out.println(test.revSolution(10,10));

	}
}
