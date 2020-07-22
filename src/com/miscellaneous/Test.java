package com.miscellaneous;

public class Test {

	public static int solution(int num) {
		int ptr; // Used for bitwise operation.
		for (ptr = 1; ptr > 0; ptr <<= 1) // Find the lowest bit 1
			if ((num & ptr) != 0)
				break;
		int cnt = 0; // Count the (possible) gap
		int ret = 0; // Keep the longest gap.
		for (; ptr > 0; ptr <<= 1) {
			if ((num & ptr) != 0) { // If it's bit 1
				ret = cnt < ret ? ret : cnt; // Get the bigger one between cnt and ret
				cnt = -1; // Exclude this bit
			}
			cnt++; // Increment the count. If this bit is 1, then cnt would become 0 beause we set
					// the cnt as -1 instead of 0.
		}
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stua\aaaaaaaaaaaaaaaaaaaaaaaaaaaaab
		// String st = "file.htm";
		// String sourceFileName =
		// st.replaceAll("(.html)|(.exe)|(.hta)|(.htm)|(.js)|(.jar)|(.vbs)|(.vb)|(.sfx)|(.bat)",".xxx");
		// System.out.println(sourceFileName);
		int a = 10;
		a >>>= 10;
		System.out.println(a);

		int ptr = 1;

		int pt = ptr >>= 1;
		System.out.println(pt);

	}

}
