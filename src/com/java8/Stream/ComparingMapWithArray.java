package com.java8.Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ComparingMapWithArray {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		Map<String, Integer> mbMap = new HashMap();
		mbMap.put("SS", 1);
		mbMap.put("SS1", 2);
		List<Integer> commonElements = new ArrayList<Integer>();
		Set<Integer> mapValues = new HashSet<>(mbMap.values());
		// java 7
		for (int i : lst) {
			if (mbMap.containsValue(i)) {
				commonElements.add(i);
			}

		}
		System.out.println("commonElements using java 7  " + commonElements);
		// java 8
		List<Integer> commonElements1 = lst.stream().filter(mapValues::contains).collect(Collectors.toList());
		System.out.println("commonElements using java 8 " + commonElements1);

	}

}
