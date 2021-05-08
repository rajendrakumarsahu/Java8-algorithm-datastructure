package com.java8.Stream;

import java.util.List;

public interface SumInterface {

	static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}
}
