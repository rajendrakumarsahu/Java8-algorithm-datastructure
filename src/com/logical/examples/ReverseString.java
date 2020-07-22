package com.logical.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

//Class of ReverseString
class ReverseString
{
 public static void main(String[] args)
 {
     String input = "Rajendra";

     // getBytes() method to convert string 
     // into bytes[].
     byte [] strAsByteArray = input.getBytes();

     byte [] result = 
                new byte [strAsByteArray.length];

     // Store result in reverse order into the
     // result byte[]
     for (int i = 0; i<strAsByteArray.length; i++)
         result[i] = 
          strAsByteArray[strAsByteArray.length-i-1];

     System.out.println(new String(result));
     
     
     //Building method
     
    // String input = "Geeks for Geeks";
     
     StringBuilder input1 = new StringBuilder();

     // append a string into StringBuilder input1
     input1.append(input);

     // reverse StringBuilder input1
     input1 = input1.reverse();

     // print reversed String
     System.out.println(input1);
     
     
     
     //reverse array
     
   //  String input = "Geeks For Geeks";
     char[] hello = input.toCharArray();
     List<Character> trial1 = new ArrayList<>();

     for (char c: hello)
         trial1.add(c);

     Collections.reverse(trial1);
     ListIterator li = trial1.listIterator();
     while (li.hasNext())
         System.out.print(li.next());
     
 }
}