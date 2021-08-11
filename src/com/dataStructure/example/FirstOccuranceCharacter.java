package com.dataStructure.example;

public class FirstOccuranceCharacter {

	public static void main(String[] args) {
		String st = "abacdefghh";
		for (int i = 0; i < st.length() - 1; i++) {
			if (st.charAt(i) == st.charAt(i + 1)) {
				System.out.println("" + st.charAt(i));
			}

		}

	}

}
