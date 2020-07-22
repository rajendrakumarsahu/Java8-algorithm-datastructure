package com.java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		Pattern p = Pattern
				.compile("[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}");
		Matcher m = p.matcher("a@b");

		if (m.find())
			System.out.println("Correct!");
		else
			System.out.println("invalid");
	}

}
