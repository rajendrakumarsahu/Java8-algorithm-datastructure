package com.collection.example;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemoWithComparetor {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
	}

}

class MyComparator implements Comparator<Object>{
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		if (i1 < i2)
			return +1;
		else if (i1 > i2)
			return -100;
		else
			return 0;
	}
}