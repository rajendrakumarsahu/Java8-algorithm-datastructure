package com.designpattern.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleToneMainClass {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.submit(new Thread(() -> System.out.println(SingleToneClass.getInstance().hashCode())));
		executorService.submit(new Thread(() -> System.out.println(SingleToneClass.getInstance().hashCode())));
		executorService.submit(new Thread(() -> System.out.println(SingleToneClass.getInstance().hashCode())));
		executorService.submit(new Thread(() -> System.out.println(SingleToneClass.getInstance().hashCode())));
		executorService.submit(new Thread(() -> System.out.println(SingleToneClass.getInstance().hashCode())));

	}

}

ExecutorService executorService = Executors.newFixedThreadPool(10);
executorService.submit(new Thread(() -> System.out.println(SingleTon.getInstance().hashCode())));
executorService.submit(new Thread(() -> System.out.println(SingleTon.getInstance().hashCode())));
