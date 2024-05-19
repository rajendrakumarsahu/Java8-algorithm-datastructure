package com.algorithm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumArrayIndexMain {

	public static void main(String[] args) {
		// Input: nums = [3,2,4], target = 6
		// Output: [1,2]

		int[] list = { 3, 2, 1, 4 };

		int target = 6;
		SumArrayIndexMain arrayIndexMain = new SumArrayIndexMain();
		List<Integer> subList1 = arrayIndexMain.getSumArrayWithIndex(list, target);
		System.out.println(subList1);

	}

	public List<Integer> getSumArrayWithIndex(int[] list, int target) {

		List<Integer> subList = new ArrayList<>();

		for (int i = 0; i <= list.length - 1; i++) {
			for (int j = i + 1; j <= list.length - 1; j++) {

				int twoIndexNum = list[i] + list[j];
				if (twoIndexNum == target) {
					subList.add(i);
					subList.add(j);
				}
				// twoIndexNum = 0;
			}

		}
		return subList;
	}

	public List<Integer> getSumArrayWithIndex1(int[] list, int target) {

		List<Integer> subList = new ArrayList<>();
		Map map = new HashMap<Integer, Integer>();

		return subList;
	}

}

//public class TestSumArrayIndexMain {
//
//	int[] a = {1,2,3,4}
//	int target = 5;
//	int b[] = {1,2}When.getSumArrayWithIndex(a,target).then(b);
//
//}
