package com.string.example;

public class StringPool {

	public static void main(String[] args) {
	String s1="abc";
	String s2="abc";
	String s5 = s1.toUpperCase();
	String s3= new String("java");
	String s4= new String("java");
	System.out.println(s1);
	System.out.println(s5);
	System.out.println(s1==s2);
	System.out.println(s3.intern()==s4.intern());

	}

}
