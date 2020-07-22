package com.oops;

import java.time.LocalDate;

public class TestDate {

	public static void main(String[] args) {
		System.out.println(LocalDate.now().getMonth());
		System.out.println(LocalDate.now().getMonthValue());
		System.out.println(String.format("%02d", LocalDate.now().getMonthValue()));

	}

}
