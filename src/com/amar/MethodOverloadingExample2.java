/*
 * 
 * This class will illustrate method overloading or static polymorphism  (changing sequence of parameter list)
 * version
 * 23-03-2017
 */


package com.amar;

public class MethodOverloadingExample2 {
	
	public void myMethod(int a, double d){
		System.out.println("First method");
	}
	
	public int myMethod(double d, int a){
		System.out.println("second method");
		return a;
	}

	public static void main(String[] args) {
		
         new MethodOverloadingExample2().myMethod(10, 10.10);
	}

}
