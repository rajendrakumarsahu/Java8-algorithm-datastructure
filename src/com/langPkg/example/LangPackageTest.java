package com.langPkg.example;

public class LangPackageTest {

	public LangPackageTest() {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return getClass().getName() + "@5" +
		Integer.toHexString(hashCode());
		}
	public static void main(String[] args) {
		LangPackageTest t = new LangPackageTest();
		System.out.println(t);//com.langPkg.example.LangPackageTest@15db9742

	}

}
