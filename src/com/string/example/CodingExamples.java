package com.string.example;

public class CodingExamples {
	 public static void main(String args[])
	    {
	        int i = (byte) + (char) - (int) + (long) - 1;
	 
	        System.out.println(i);
	        
	        String[] s1 = {"ONE", "TWO", "THREE", "FOUR"};
	        
	        String[] s2 = {"THREE", "TWO", new String("ONE")};
	        
	        for(String s:s1) {
	        	System.out.println(s.hashCode());
	        }
	 
	        System.out.println(s1[0] == s2[2]);
	 
	        System.out.println(s1[1] == s2[1]);
	 
	        System.out.println(s1[2] == s2[0]);
	    }
}
