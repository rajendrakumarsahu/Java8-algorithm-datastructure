package com.hackerRank.examples;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		double payment = 12324.134;
		NumberFormat nfus = NumberFormat.getCurrencyInstance(Locale.US);
		String us = nfus.format(payment);
		NumberFormat nfIn = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String india = nfIn.format(payment);
		
		NumberFormat nfch = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = nfch.format(payment);
		NumberFormat nfFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = nfFr.format(payment);
		System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        
        

	}

}
