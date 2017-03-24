/*
 * This program will illustrate the usage of overridden toString method 
 * @version 24-03-2017
*/

package com.amar;


public class Student2 {
	/**
	 * We will create 2 students objects and will print them using toString method 
	 *  (here overridden toString method is called)
	 */
		 int rollno;  
		 String name;  
		 String city;  
		  
		 Student2(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		  
		 public String toString(){//overriding the toString() method  
			  return rollno+" "+name+" "+city;  
			  
		 }
		 public static void main(String args[]){  
		   Student2 s1=new Student2(101,"Raj","lucknow");  
		   Student2 s2=new Student2(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 }  
		}  
