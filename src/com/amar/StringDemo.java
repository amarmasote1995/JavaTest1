/*
 * This class will illustrate various methods which string class has.
 * 23-03-2017
 * 
 */

package com.amar;

public class StringDemo {

	public static void main(String[] args) {
		
        String s = new String("Yantriks");
        String s2 = new String("Ind");
        String s3 = s + s2 + "Private Ltd";
        System.out.println(s + s2 + s3);
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.indexOf('a'));
        System.out.println(s.concat(s2));
        System.out.println(s.isEmpty());
        System.out.println(s.contains("antriks"));
        System.out.println(s2.toCharArray());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s3.lastIndexOf('L'));
        System.out.println(s2.replace('I', 'i'));
        
	}

}
