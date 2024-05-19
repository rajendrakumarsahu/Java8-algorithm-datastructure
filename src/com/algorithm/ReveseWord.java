package com.algorithm;
import java.util.ArrayList;
import java.util.List;

public class ReveseWord {

	public static void main(String[] args) {
		String st = "My Name is Rajendra ";

		char[] charray = st.toCharArray();

		String st1 = "";
		List<String> list = new ArrayList<>();
		for (char c : charray) {
			if (c == 32) {
				list.add(st1);
				st1 = "";
			} else {
				st1 = st1 + c;
			}
		}
		List<String> list1 = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			list1.add(list.get(i));
		}

		// print list1
		for (String ss : list1) {
			System.out.println(ss);
		}

	}

}
