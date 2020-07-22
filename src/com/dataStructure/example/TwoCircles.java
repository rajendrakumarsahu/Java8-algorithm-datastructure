package com.dataStructure.example;

public class TwoCircles {

	public static void main(String[] args) {
		// 12 0 21 14 0 23
		String st = twoCircle(12, 0, 21, 14, 0, 23);
		System.out.println(st);

	}

	static String twoCircle(int x1, int y1, int r1, int x2, int y2, int r2) {
		int distSq = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		int radSumSq = (r1 + r2) * (r1 + r2);
		double distance = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
		if (distSq == radSumSq)
			return "Touching";
		if (distSq < radSumSq)
			return "Intersecting";
		if (r2 >= r1 && distance <= (r2 - r1))
			return "Disjointâ€�Outside";
		return "Disjointâ€�Inside";
	}

}
