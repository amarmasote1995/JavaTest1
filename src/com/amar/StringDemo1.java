/*
 * This class will illustrate the difference between == operator and equals() method
 */

package com.amar;


public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = new String("abcd");
		String s2 = "abcd";
		String s3 = "ABCD";
		System.out.println(s1.equals(s2));                // Content Comparison
		System.out.println(s1 == s2);                     // Reference Comparison
		System.out.println(s1.equals(s2.toLowerCase()));
        System.out.println(s1.equalsIgnoreCase(s3));      // Content Comparison ignoring case of the alphabet 
	}

}
