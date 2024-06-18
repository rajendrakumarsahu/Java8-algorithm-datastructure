package com.Collection.example;

import java.util.HashMap;
import java.util.Map;

public class HashCodeUserMain {

	public static void main(String[] args) {
		HashCodeUser h1 = new HashCodeUser(1, "Rajendra");
		HashCodeUser h2 = new HashCodeUser(2, "Rabindra");

		Map<HashCodeUser, Integer> map = new HashMap();
		map.put(h1, 11111);
		map.put(h2, 22222);
		map.put(h2, 33333);

		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());

		map.forEach((k, v) -> System.out.println("Key::" + k + "Value:::::" + v));

	}

}
