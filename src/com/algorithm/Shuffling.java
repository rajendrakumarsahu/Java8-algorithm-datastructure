package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffling {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Sorted ArrayList: " + numbers);

        // Using the shuffle() method
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);

	}

}
