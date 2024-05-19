package com.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumberInArray {

	public static void main(String[] args) {
		int ar[] = { 2, 3, 5, 4, 5, 3, 4 };

		int[] array = singleNumberAnother(ar);
		System.out.println(Arrays.toString(array));
		// Function call
		System.out.println("Element occurring once is " + singleNumber11(ar));
	}

	public static int singleNumber11(int[] nums) {
		int singleNum = 0;
		for (int num : nums) {
			singleNum = singleNum ^ num;
		}

		return singleNum;
	}

	public static int singleNumber(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				set.remove(nums[i]);
			} else {
				set.add(nums[i]);
			}
		}
		set.forEach(System.out::println);
		return set.iterator().next();

	}

// some RND getting some magic no
	public static int[] singleNumberAnother(int[] nums) {
		int[] newArr = new int[nums.length];
		if (nums.length == 1)
			return newArr;
		// { 2, 3, 5, 4, 5, 3, 4, 9 };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}

			if (count > 0) {
				count = 0;
				newArr[i] = nums[i];
			} else {
				newArr[i] = 1;
			}

		}

		return newArr;

	}

}
