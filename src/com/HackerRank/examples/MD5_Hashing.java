package com.HackerRank.examples;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5_Hashing {

	public static void main(String[] args) {
		try {
			String password = "Javarmi123";
			String hash = "f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678";
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			byte[] digest = md.digest();
			String myHash = "";// DatatypeConverter.printHexBinary(digest).toLowerCase();
			System.out.println(myHash);

			System.out.println(myHash.equals(hash));

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
