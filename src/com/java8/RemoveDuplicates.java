package com.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 5, 4, 5, 7, 7);
		Map<Integer, Integer> valueMap = new HashMap();
//
//		 
//
//		valueMap.put(1001,"1")//key is id of the value object 
//
//		valueMap.put(1002,"2")
//
//		valueMap.put(1003,"3")
		for (int i = 0; i < list.size(); i++) {

			// valueMap.put(i, valueMap.getOrDefault(valueMap.get(i), 0) + 1);
			if (valueMap.containsKey(i)) {
				valueMap.put(list.get(i), valueMap.get(i) + 1);
			} else {
				valueMap.put(list.get(i), list.get(i));
			}

		}

		for (Map.Entry<Integer, Integer> entry : valueMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
