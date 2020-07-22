package com.collection.Identifier;

import com.collection.example.Addition;

public class Test {
	public   int mul(int a,int b) {
		int c = a*b;
		return c;
	}
	public  static int mul1(int a,int b) {
		Test t = new Test();
		int d = t.mul(a,b);
		
		return d;
	}
	public static void main(String[] args) {
		String String = "Ram";
		Addition ad = new Addition();
		int sum =  ad.sum(10,15);
		
		Test t = new Test();
		
		try {
			System.out.println("********statrting******");
			
			int a = 10/0;
			
			
			System.out.println("********ending******"+a);
		} catch (Exception e) {
			System.out.println("************"+e.getMessage());
		}
		
	}

}
