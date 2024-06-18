package com.algorithm;

public class ReveseInteger {

	public static void main(String[] args) {
		int num = -2147;
		int reverseNum = getReverseNum(num);
		System.out.println(reverseNum);

	}

	private static int getReverseNum(int num) {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		if (num == min || num == max)
			return 0;
		int rev = 0;
		while (num != 0) {
			int reminder = num % 10;
			if (rev > max / 10)
				return 0;
			if (rev < min / 10)
				return 0;
			rev = rev * 10 + reminder;
			num = num / 10;
		}
		return rev;
	}

}
