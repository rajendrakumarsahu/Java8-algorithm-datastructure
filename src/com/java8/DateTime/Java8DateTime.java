package com.java8.DateTime;

import java.time.LocalDate;

public class Java8DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("the current date is " + date.getYear());
		System.out.println("the current date is " + date.getMonth());
		System.out.println("the current date is " + date.getMonthValue());
		System.out.println("the current date is " + date.now());
	}

}
