package com.HackerRank.example;

public class Palindrome {

	public static void main(String[] args) {
		String A = "Madam";
		StringBuffer bf = new StringBuffer(A);
		String str = bf.reverse().toString();
		if (A.equalsIgnoreCase(str))
			System.out.println("Yes");

	}

}
