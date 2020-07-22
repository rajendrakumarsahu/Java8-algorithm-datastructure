package com.HackerRank.examples;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateTime {

//	public static String getDay(String day, String month, String year) {
//
//		Calendar calendar = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month),Integer.parseInt(day));
//		Date dt = calendar.getTime();
//		System.out.println(dt);
//		System.out.println(dt.getDay());
//		System.out.println(Calendar.DAY_OF_WEEK);
//		int days = calendar.get(Calendar.DAY_OF_WEEK);
//		DayOfWeek dayName = DayOfWeek.of(days);
//		return dayName.name();
//
//	}
	public static String getDay1(String day, String month, String year) {

		LocalDate date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		System.out.println("date3: " + date.getDayOfWeek().toString());

		return date.getDayOfWeek().toString();

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		System.out.println(getDay1(day, month, year));

	}

}
